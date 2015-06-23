/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.whileapp.hibernate;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.mapping.EncPersona;
import com.mx.whileapp.hibernate.mapping.EncProducto;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    private ApplicationContext ac;

    public ApplicationContext getAc() {
        return ac;
    }

    public void setAc(ApplicationContext ac) {
        this.ac = ac;
    }
    
    
    
    public static void main(String[] args){
//        Session session = HibernateSessionFactory.getSession();
        
        //Seleccion 
          //Test EncPersona
//        EncPersona per = (EncPersona)session.get(EncPersona.class, 1);
//        System.out.println(per.getNombre());
//        System.out.println(per.getEscuela());
//        System.out.println(per.getCarrera());
//        System.out.println(per.getFec_entrada());
        
        //Test EncProducto
//        EncProducto pro = (EncProducto)session.get(EncProducto.class, 1);
//        System.out.println(pro.getId_producto());
//        System.out.println(pro.getOtros());
//        System.out.println(pro.isL293d());
        
        //TestUnionOneToOne
//        EncPersona per = (EncPersona)session.get(EncPersona.class, 2);
//        System.out.println(per.getId_persona());
//        System.out.println(per.getNombre());
//        System.out.println(per.getEscuela());
//        System.out.println(per.getCarrera());
//        System.out.println(per.getFec_entrada()); 
//        System.out.println(per.getEnc_pro().getPersona());
//        System.out.println(per.getEnc_pro().getId_producto());
// 
        
//        Transaction tr = session.beginTransaction();
//        Query query = (Query)session.createSQLQuery( "select nextval('personas_encuesta_id_persona_seq');" );
//        Integer key = Integer.parseInt(query.list().get( 0 ).toString());
//        EncPersona persona = new EncPersona(key, "Eduardo Ji", "ESIME", "COMPU", new Date(System.currentTimeMillis())); 
//        EncProducto prod= new EncProducto(key, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate", key);
//        session.save(persona);
//        session.save(prod);
//        tr.commit();
//        session.close();
        
        
        //Prueba de hibernate
//        EncPersonaDAOHibernate en = new EncPersonaDAOHibernate();
//        EncPersonaDTO persona = new EncPersonaDTO("Eduardo Hernandez", "ESIME", "COMPU", new Date(System.currentTimeMillis()));
//        EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");
//
//        en.insert(persona, prod);
        
        ApplicationContext appContext = new FileSystemXmlApplicationContext("src/java/beans.xml");
       
        EncPersonaDAO en = (EncPersonaDAO)appContext.getBean("encPersonaDAO");
        EncPersonaDTO persona = new EncPersonaDTO("Eduardo J", "ESIME", "COMPU", new Date(System.currentTimeMillis()));
        EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");

        for(int i = 1; i <= 10; i++ )
            en.insert(persona, prod);
    }
}
