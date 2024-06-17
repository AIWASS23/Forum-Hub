package forum_hub.controller.dto.usuario;

public record CriarUsuarioDto(
        String nome,
        String email,
        String login,
        String senha
) {
}
