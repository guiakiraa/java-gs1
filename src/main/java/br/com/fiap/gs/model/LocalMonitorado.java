package br.com.fiap.gs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "local_monitorado")
public class LocalMonitorado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "O nome do local monitorado não pode estar em branco.")
    private String nome;
    @ManyToOne
    @JoinColumn(name = "fk_endereco")
    @NotEmpty(message = "O endereço não pode ser nulo.")
    private Endereco endereco;
    @NotEmpty(message = "A latitude não pode ser nula.")
    @DecimalMin(value = "-90.0", message = "A latitude deve ser no mínimo -90.")
    @DecimalMax(value = "90.0", message = "A latitude deve ser no máximo 90.")
    private double latitude;
    @NotEmpty(message = "A longitude não pode ser nula.")
    @DecimalMin(value = "-180.0", message = "A longitude deve ser no mínimo -180.")
    @DecimalMax(value = "180.0", message = "A longitude deve ser no máximo 180.")
    private double longitude;
    @NotEmpty(message = "O tipo de zona não pode estar em branco.")
    private String tipoZona;
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<SensorLixo> sensores;
}
