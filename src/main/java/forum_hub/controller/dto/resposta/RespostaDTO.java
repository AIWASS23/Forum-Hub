package forum_hub.controller.dto.resposta;

import java.util.List;

public record RespostaDTO(
        List<RespostaItemDTO> itensDaResposta,
        int pagina,
        int tamanhoDaPagina,
        int totalDePaginas,
        long totalDeElementos) {
}
