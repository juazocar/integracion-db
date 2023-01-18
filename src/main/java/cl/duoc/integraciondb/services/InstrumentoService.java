package cl.duoc.integraciondb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.integraciondb.model.entities.Instrumento;
import cl.duoc.integraciondb.model.repository.InstrumentoRepository;

@Service
public class InstrumentoService {

    @Autowired
    InstrumentoRepository instrumentoRepository;
    
    public List<Instrumento> getAll(){
        return instrumentoRepository.findAll();
    }

    public Instrumento add(Instrumento instrumento){
        return instrumentoRepository.save(instrumento);
    }
    
    
}
