package forum_hub.controller.dto.resposta;


import forum_hub.dominio.entities.Resposta;

import java.time.Instant;

public record DetalharRespostaDTO(
        String mensagem,
        Instant dataCriacao,
        Instant dataAlteracao,
        String topico,
        String usuario,
        Boolean status,
        Boolean solucao
) {

    public DetalharRespostaDTO(Resposta resposta) {
        this(
                resposta.getMensagem(),
                resposta.getDataCriacao(),
                resposta.getDataAlteracao(),
                resposta.getTopico().getTitulo(),
                resposta.getAutor().getNome(),
                resposta.getStatus(),
                resposta.getSolucao()
        );
    }
}


