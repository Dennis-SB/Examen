package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Dennis Serrano Barquero
 */

@Data
@Entity
@Table(name="concierto")
public class Concierto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcierto;
    private String artista, costo, fecha, capacidad, lugar;

    public Concierto() {}
    
    public Concierto(String artista, String costo, String fecha, String capacidad, String lugar) {
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.lugar = lugar;
    }
}