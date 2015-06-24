package com.mx.whileapp.control;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class EncuenstaController {
    @RequestMapping(value = "/AgregarEncuesta", method = RequestMethod.GET)
    public ModelAndView encuesta(){
        System.out.println("Entro en controlador");
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("file:web/WEB-INF/Controlador-servlet");
//       
//        EncPersonaDAO en = (EncPersonaDAO)appContext.getBean("encPersonaDAO");
//        EncPersonaDTO persona = new EncPersonaDTO("Eduardo J", "ESIME", "COMPU", new Date(System.currentTimeMillis()));
//        EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");
//        
//        en.insert(persona, prod);
        return new ModelAndView("hola", "cadena", "programacion");
    }
    
}
