package forum_hub.controller.dto.curso;

import java.util.List;

public record CursoDto(
        List<CursoItemDto> itensDoCurso,
        int pagina,
        int tamanhoDaPagina,
        int totalDePaginas,
        long totalDeElementos) {
}