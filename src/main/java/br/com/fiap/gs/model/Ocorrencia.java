package br.com.fiap.gs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.time.LocalDateTime;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ocorrencia")
public class Ocorrencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "A descrição não pode estar em branco.")
    @Size(min = 10, max = 500, message = "A descrição deve ter entre 10 e 500 caracteres.")
    private String descricao;
    @NotEmpty(message = "A data da ocorrência não pode ser nula.")
    private LocalDateTime dataOcorrencia;
    @NotEmpty(message = "O status da ocorrência não pode ser nulo.")
    @Enumerated(EnumType.STRING)
    private StatusOcorrenciaEnum status;
}
