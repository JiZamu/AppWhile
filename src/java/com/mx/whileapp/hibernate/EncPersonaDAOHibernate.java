package com.mx.whileapp.hibernate;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.mapping.EncPersona;
import com.mx.whileapp.hibernate.mapping.EncProducto;
import java.util.Collection;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EncPersonaDAOHibernate implements EncPersonaDAO{

    @Override
    public void insert(EncPersonaDTO persona) {
        //return 1;
    }

    @Override
    public void insert(EncPersonaDTO persona, EncProductoDTO producto) {
        Session session = HibernateSessionFactory.getSession();
        Transaction tr = session.beginTransaction();
        
        Query query = (Query)session.createSQLQuery( "select nextval('personas_encuesta_id_persona_seq');" );
        Integer key = Integer.parseInt(query.list().get( 0 ).toString());
        
        EncPersona pers = new EncPersona(key, persona.getNombre(), persona.getEscuela(), persona.getCarrera(), persona.getFec_entrada()); 
        EncProducto prod = new EncProducto(key, producto.isResistor(), producto.isCable_dupont(), producto.isSensor_340k(), producto.isL293d(), producto.isL298p(), producto.isL298nh(), producto.isQrd1114(), producto.isCny70(), producto.isTcrt5000(), producto.isPlaca_fenolica(), producto.isProtoboard(), producto.isBaterias_lipo(), producto.isPic(), producto.isAvr(), producto.isLed(), producto.isMatriz(), producto.getOtros(), key);
        
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
