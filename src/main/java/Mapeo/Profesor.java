/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jonathan
 */
@Entity
@Table(name="profesor")
public class Profesor {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idprofesor")
    private int id_profesor;
    
    @Column(name = "nombreprofesor")
    private String nombre_profesor;
    
    @Column(name = "tipoprofesor")
    private String tipo_profesor;
    //Ejemplo anotacion OneToMany
    @OneToMany(mappedBy="profesor_grupo")
    private List<Grupo> grupos_profesor;

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getTipo_profesor() {
        return tipo_profesor;
    }

    public void setTipo_profesor(String tipo_profesor) {
        this.tipo_profesor = tipo_profesor;
    }

    public List<Grupo> getGrupos_profesor() {
        return grupos_profesor;
    }

    public void setGrupos_profesor(List<Grupo> grupos_profesor) {
        this.grupos_profesor = grupos_profesor;
    }
    
    
    
    
    
    
}
