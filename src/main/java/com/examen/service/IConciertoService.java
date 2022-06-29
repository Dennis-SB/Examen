package com.examen.service;

import com.examen.dao.ConciertoDao;
import com.examen.entity.Concierto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dennis Serrano Barquero
 */

@Service
public class IConciertoService implements ConciertoService {
    @Autowired
    private ConciertoDao conciertodao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Concierto> getConciertos() {
        return (List<Concierto>) conciertodao.findAll();
    }

    @Override
    @Transactional
    public void save(Concierto concierto) {
        conciertodao.save(concierto);
    }

    @Override
    @Transactional
    public void delete(Concierto concierto) {
        conciertodao.delete(concierto);
    }

    @Override
    @Transactional(readOnly = true)
    public Concierto getConcierto(Concierto concierto) {
        return conciertodao.findById(concierto.getIdConcierto()).orElse(null);
    }
}