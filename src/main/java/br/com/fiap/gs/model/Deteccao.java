package br.com.fiap.gs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "deteccao")
public class Deteccao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "A data da detecção não pode ser nula.")
    private LocalDateTime dataDeteccao;
    @Min(value = 0, message = "A quantidade de lixo não pode ser negativa.")
    private double quantidadeLixo;
    @Lob
    @NotEmpty(message = "A imagem em Base64 não pode estar em branco.")
    private String imagemBase64;
    private boolean riscoEnchente;
    @OneToMany(mappedBy = "deteccao", cascade = CascadeType.ALL)
    private List<Ocorrencia> ocorrencias;
}
