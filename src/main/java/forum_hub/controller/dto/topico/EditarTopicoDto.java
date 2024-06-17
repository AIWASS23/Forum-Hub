package forum_hub.controller.dto.topico;

public record EditarTopicoDto(
        String titulo,
        String mensagem,
        Integer cursoId,
        Boolean status
) {
}
