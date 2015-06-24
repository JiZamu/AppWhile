package com.mx.whileapp.control;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.EncPersonaDAOHibernate;
import com.mx.whileapp.hibernate.HibernateSessionFactory;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class EncuenstaController {
    @RequestMapping(value = "/AgregarEncuesta", method = RequestMethod.GET)
    public ModelAndView agregarEncuesta(){
        System.out.println("Entro en controlador");
        //ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:src/java/beans.xml");
        //EncPersonaDAO en = (EncPersonaDAO)appContext.getBean("encPersonaDAO");
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        EncPersonaDAOHibernate en = new EncPersonaDAOHibernate();
        en.setSession(session);
        en.setTransaction(transaction);
        
        System.out.println(en.getSession());
        System.out.println(en.getTransaction());
       
        EncPersonaDTO persona = new EncPersonaDTO("Javier", "ESIME", "COMPU", new Date(System.currentTimeMillis()));
        EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");
        
        en.insert(persona, prod);
        return new ModelAndView("hola", "cadena", "programacion");
    }
    
//    @RequestMapping(value = "/Encuesta", method = RequestMethod.GET)
//    public ModelAndView encuesta(){
//    
//        return new ModelAndView("hola", "cadena", "programacion");
//    }
}
