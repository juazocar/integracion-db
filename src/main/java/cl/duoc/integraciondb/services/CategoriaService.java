package cl.duoc.integraciondb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.integraciondb.model.entities.Categoria;
import cl.duoc.integraciondb.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    CategoriaRepository categoriaRepository;
    
    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Categoria add(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
