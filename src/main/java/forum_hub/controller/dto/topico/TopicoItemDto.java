package forum_hub.controller.dto.topico;

import java.time.Instant;

public record TopicoItemDto(
        String titulo,
        String mensagem,
        Instant dataCriacao,
        Boolean status,
        String autor,
        String curso
) {
}
