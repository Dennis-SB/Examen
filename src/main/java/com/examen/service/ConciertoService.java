package com.examen.service;

import com.examen.entity.Concierto;
import java.util.List;

/**
 *
 * @author Dennis Serrano Barquero
 */

public interface ConciertoService {
    public List<Concierto> getConciertos();
    public void save(Concierto concierto);
    public void delete(Concierto concierto);
    public Concierto getConcierto(Concierto concierto);
}