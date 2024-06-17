package forum_hub.controller.dto;

public record LoginRequest(
        String login,
        String senha
) {
}