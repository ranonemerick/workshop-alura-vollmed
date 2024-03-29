package br.com.api.demo.domain.medico;

import br.com.api.demo.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
    @Query("""
            SELECT m FROM Medico m
            WHERE m.ativo = true
            AND m.id not in(
                SELECT c.medico.id from Consulta c
                WHERE c.data = :data
            )
            AND m.especialidade = :especialidade
            ORDER BY RANDOM()
            LIMIT 1
            """)
    Medico escolherMedicoAleatorioNaData(Especialidade especialidade, LocalDateTime data);

    @Query("""
            SELECT m.ativo
            FROM Medico m
            WHERE m.id = :id
            """)
    Boolean findAtivoById(Long id);

}
