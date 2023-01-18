package cl.duoc.integraciondb.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "instrumento")
//@Table(name = "instrumento", schema = "schema_name")
public class Instrumento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_instrumento")
    private int    idInstrumento;

    @Basic
    @Column (name = "nombre")
    private String nombre;

    @Basic
    @Column (name = "marca")
    private String marca;

    @Basic
    @Column(name = "id_categoria")
    private int idCategoria;

    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_categoria", referencedColumnName = "id" , insertable = false, updatable = false)
    @JsonBackReference
    private Categoria categoriaByCategoriaIdFk;


    public Instrumento() {
    }

    public int getIdInstrumento() {
        return idInstrumento;
    }
    public void setIdInstrumento(int idInstrumento) {
        this.idInstrumento = idInstrumento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }


    
}
