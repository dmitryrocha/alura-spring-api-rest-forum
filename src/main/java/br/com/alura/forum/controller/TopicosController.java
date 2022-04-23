package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.controller.repository.TopicoRepository;
import br.com.alura.forum.modelo.Topico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso) {

        if(nomeCurso == null) {
            List<Topico> topicos = topicoRepository.findAll();
        } else {
            List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
        }
        return TopicoDto.converter(topicos);
    }
}
