package com.mx.whileapp.hibernate;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.mapping.EncPersona;
import com.mx.whileapp.hibernate.mapping.EncProducto;
import java.util.Collection;
import org.hibernate.Session;

public class EncPersonaDAOHibernate implements EncPersonaDAO{

    @Override
    public int insert(EncPersonaDTO persona) {
        return 1;
    }

    @Override
    public int isert(EncPersonaDTO persona, EncProductoDTO producto) {
        Session session = HibernateSessionFactory.getSession();
        EncPersona pers = new EncPersona();
        pers.setCarrera(persona.getCarrera());
        pers.setEscuela(persona.getEscuela());
        pers.setFec_entrada(persona.getFec_entrada());
        pers.setNombre(persona.getNombre());
        EncProducto prod = pers.getEnc_pro();
        
        
        session.save();
    }

    @Override
    public Collection<EncPersonaDTO> getPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
