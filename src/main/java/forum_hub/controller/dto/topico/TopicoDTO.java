package forum_hub.controller.dto.topico;

import java.util.List;

public record TopicoDTO(
        List<TopicoItemDto> itensDoTopico,
        int pagina,
        int tamanhoDaPagina,
        int totalDePaginas,
        long totalDeElementos) {
}