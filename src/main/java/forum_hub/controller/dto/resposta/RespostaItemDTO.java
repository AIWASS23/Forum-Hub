package forum_hub.controller.dto.resposta;

import java.time.Instant;

public record RespostaItemDTO(
        String mensagem,
        Instant dataCriacao,
        Instant dataAlteracao,
        String topico,
        String usuario,
        Boolean status,
        Boolean solucao

) {
}
