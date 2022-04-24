package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCurso_Nome(String nomeCurso);


//    Outra maneira de fazer a mesma coisa
//    @Query("SELECT t FROM Topico t WHERE  t.curso.nome = := nomeCurso")
//    List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
