package br.com.api.demo.medico;

import br.com.api.demo.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.ORDINAL)
    private Especialidade especialidade;

    private Endereco endereco;

}
