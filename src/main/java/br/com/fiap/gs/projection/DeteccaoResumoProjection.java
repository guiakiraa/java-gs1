package br.com.fiap.gs.projection;

import java.time.LocalDateTime;

public interface DeteccaoResumoProjection {
    Long getId();
    LocalDateTime getDataDeteccao();
    Double getQuantidadeLixo();
    Boolean getRiscoEnchente();
}
