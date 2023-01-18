package cl.duoc.integraciondb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.integraciondb.model.entities.Categoria;
import cl.duoc.integraciondb.model.entities.Instrumento;
import cl.duoc.integraciondb.services.InstrumentoService;

@RestController
@RequestMapping("/instrumentos")
public class InstrumentoController {

    @Autowired
    InstrumentoService instrumentoService;
    
    @GetMapping(path = "/instrumento", produces = { "application/json" })
    public List<Instrumento> getAll(){
        return instrumentoService.getAll();
    }

    @PostMapping(path = "/instrumento", consumes = {"application/json"},  produces = {"application/json"})
    public Instrumento add(@RequestBody Instrumento instrumento){
        return instrumentoService.add(instrumento);
    }

    
}
