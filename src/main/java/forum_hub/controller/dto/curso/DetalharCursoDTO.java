package forum_hub.controller.dto.curso;


import forum_hub.dominio.entities.Curso;
import forum_hub.dominio.entities.Topico;

import java.util.List;

public record DetalharCursoDTO(
        Long id,
        String nome,
        String categoria,
        List<Topico> topicos,
        String usuario
) {

    public DetalharCursoDTO(Curso curso) {
        this(
                curso.getCursoId(),
                curso.getNome(),
                curso.getCategoria(),
                curso.getTopicos(),
                curso.getUsuario().getNome()
        );
    }
}


