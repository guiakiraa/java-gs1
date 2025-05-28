package br.com.fiap.gs.projection;

import java.time.LocalDateTime;

public interface OcorrenciaProjection {
    Long getId();
    String getDescricao();
    String getStatus();
    LocalDateTime getDataOcorrencia();
    DeteccaoInfo getDeteccao();

    interface DeteccaoInfo {
        Long getId();
        Boolean getRiscoEnchente();
        SensorInfo getSensor();

        interface SensorInfo {
            String getTipoSensor();
        }
    }
}
