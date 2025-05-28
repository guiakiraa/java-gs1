package br.com.fiap.gs.projection;

public interface LocalMonitoradoProjection {
    Long getId();
    String getNome();
    double getLatitude();
    double getLongitude();
    String getTipoZona();
    EnderecoInfo getEndereco();

    interface EnderecoInfo {
        String getLogradouro();
        String getBairro();
        String getCidade();
        String getEstado();
        String getCep();
    }
}
