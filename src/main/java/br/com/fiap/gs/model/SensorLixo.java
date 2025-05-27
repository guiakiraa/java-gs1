package br.com.fiap.gs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sensor_lixo")
public class SensorLixo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "O tipo de sensor não pode estar em branco.")
    private String tipoSensor;
    @NotEmpty(message = "A data de instalação não pode ser nula.")
    @PastOrPresent(message = "A data de instalação não pode ser no futuro.")
    private LocalDate dataInstalacao;
    private boolean ativo;
    @OneToMany(mappedBy = "sensor", cascade = CascadeType.ALL)
    private List<Deteccao> deteccoes;
}
