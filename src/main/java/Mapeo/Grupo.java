/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jonathan
 */
@Entity
@Table(name="grupo")
public class Grupo {
    @Id@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idgrupo")
    private int id_grupo;
    
    @Column(name = "nombregrupo")
    private String nombre_grupo;
    
    @Column(name = "semestregrupo")
    private int semestre_grupo;
   
    @Column(name = "carreragrupo")
    private String carrera_grupo;
    //Ejemplo Anotacion ManyToOne
    @ManyToOne
    @JoinColumn(name="profesor_id")
    private Profesor profesor_grupo;

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    public int getSemestre_grupo() {
        return semestre_grupo;
    }

    public void setSemestre_grupo(int semestre_grupo) {
        this.semestre_grupo = semestre_grupo;
    }

    public String getCarrera_grupo() {
        return carrera_grupo;
    }

    public void setCarrera_grupo(String carrera_grupo) {
        this.carrera_grupo = carrera_grupo;
    }

    public Profesor getProfesor_grupo() {
        return profesor_grupo;
    }

    public void setProfesor_grupo(Profesor profesor_grupo) {
        this.profesor_grupo = profesor_grupo;
    }
    
    
    
    
}
