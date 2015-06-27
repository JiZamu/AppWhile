package com.mx.whileapp.control;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import com.mx.whileapp.hibernate.EncPersonaDAOHibernate;
import com.mx.whileapp.hibernate.HibernateSessionFactory;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class EncuenstaController {
    @RequestMapping(value = "/AgregarEncuesta", method = RequestMethod.POST)
    public ModelAndView agregarEncuesta(HttpServletRequest request){
        
        String nombre = request.getParameter("nombre");
        String escuela = request.getParameter("escuela");
        String carrera = request.getParameter("carrera");
        String otros = request.getParameter("otros");
        String[] selection = request.getParameterValues("selection");
        
        ArrayList<String> values = new ArrayList<String>();
        
        if(selection != null){
            for (String value : selection){
                System.out.println(value);
                values.add(value);
            }
        } 
        
        System.out.println("Elemento resistor: "+values.contains("resistor"));
        System.out.println("Elemento matriz: "+values.contains("matriz"));
        
        //ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:src/java/beans.xml");
        //EncPersonaDAO en = (EncPersonaDAO)appContext.getBean("encPersonaDAO");
        SessionFactory sessionf = HibernateSessionFactory.getSessionFactory();
        Session session = sessionf.openSession();
        Transaction transaction = session.beginTransaction();
        EncPersonaDAOHibernate en = new EncPersonaDAOHibernate();
        en.setSession(session);
        en.setTransaction(transaction);
       
        EncPersonaDTO persona = new EncPersonaDTO(nombre, escuela, carrera, new Date(System.currentTimeMillis()));
        EncProductoDTO prod = new EncProductoDTO(values.contains("resistor"), values.contains("cable_dupont"), values.contains("sensor_340k"), values.contains("l293d"), 
                                                values.contains("l298p"), values.contains("l298nh"), values.contains("qrd1114"), values.contains("cny70"), 
                                                values.contains("tcrt5000"), values.contains("placa_fenolica"), values.contains("protoboard"), values.contains("baterias_lipo"), 
                                                values.contains("pic"), values.contains("avr"), values.contains("led"), values.contains("matriz"), otros);
        
        en.insert(persona, prod);
        return new ModelAndView("hola", "cadena", "programacion");
    }
}
