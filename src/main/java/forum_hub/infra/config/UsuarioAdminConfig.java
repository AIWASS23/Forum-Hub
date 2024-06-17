package forum_hub.infra.config;

import forum_hub.dominio.entities.Perfil;
import forum_hub.dominio.entities.Usuario;
import forum_hub.dominio.repository.PerfilRepository;
import forum_hub.dominio.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Configuration
public class UsuarioAdminConfig implements CommandLineRunner {

    private PerfilRepository perfilRepository;
    private UsuarioRepository usuarioRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public UsuarioAdminConfig(PerfilRepository perfilRepository,
                              UsuarioRepository usuarioRepository,
                              BCryptPasswordEncoder passwordEncoder) {
        this.perfilRepository = perfilRepository;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        var roleAdmin = perfilRepository.findByNome(Perfil.Values.ADMIN.name());

        var userAdmin = usuarioRepository.findByLogin("admin");

        userAdmin.ifPresentOrElse(
                usuario -> {
                    System.out.println("admin ja existe");
                },
                () -> {
                    var usuario = new Usuario();
                    usuario.setNome("Administrador do Sistema");
                    usuario.setEmail("admin@sistema.net");
                    usuario.setLogin("admin");
                    usuario.setSenha(passwordEncoder.encode("123456"));
                    usuario.setPerfis(Set.of(roleAdmin));
                    usuarioRepository.save(usuario);
                }
        );
    }
}