package cl.duoc.integraciondb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.integraciondb.model.entities.Instrumento;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer>{
    
}
