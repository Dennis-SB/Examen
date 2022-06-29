package com.examen.dao;

import com.examen.entity.Concierto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dennis Serrano Barquero
 */

public interface ConciertoDao extends CrudRepository<Concierto, Long> {
    
}