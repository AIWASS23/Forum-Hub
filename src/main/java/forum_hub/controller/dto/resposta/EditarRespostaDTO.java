package forum_hub.controller.dto.resposta;

public record EditarRespostaDTO(
        String mensagem,
        Boolean status,
        Boolean solucao
) {
}
