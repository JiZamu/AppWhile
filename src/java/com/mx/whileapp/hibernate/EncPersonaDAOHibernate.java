package com.mx.whileapp.hibernate;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.mapping.EncPersona;
import com.mx.whileapp.hibernate.mapping.EncProducto;
import java.util.Collection;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EncPersonaDAOHibernate implements EncPersonaDAO{

    @Override
    public void insert(EncPersonaDTO persona) {
        //return 1;
    }

    @Override
    public void isert(EncPersonaDTO persona, EncProductoDTO producto) {
        Session session = HibernateSessionFactory.getSession();
        Transaction tr = session.beginTransaction();
        Query query = (Query)session.createSQLQuery( "select nextval('personas_encuesta_id_persona_seq');" );
        Integer key = Integer.parseInt(query.list().get( 0 ).toString());
        EncPersona pers = new EncPersona(key, "Eduardo Ji", "ESIME", "COMPU", new Date(System.currentTimeMillis())); 
        EncProducto prod= new EncProducto(key, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate", key);
        session.save(pers);
        session.save(prod);
        tr.commit();
        session.close();
    }

    @Override
    public Collection<EncPersonaDTO> getPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
