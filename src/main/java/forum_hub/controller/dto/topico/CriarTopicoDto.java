package forum_hub.controller.dto.topico;

public record CriarTopicoDto(
        String titulo,
        String mensagem,
        Integer cursoId
) {
}
