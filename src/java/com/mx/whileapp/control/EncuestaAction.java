/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.whileapp.control;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jiza
 */
public class EncuestaAction implements Action{

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response) {
         String nombre = "Alfredo";
            String escuela = "ESIME";
            String carrera = "COMUNICACIONES";
            
            ApplicationContext appContext = new FileSystemXmlApplicationContext("classpath*:/WEB-INF/beans.xml");
            EncPersonaDAO en = (EncPersonaDAO)appContext.getBean("encPersonaDAO");
            EncPersonaDTO persona = new EncPersonaDTO(nombre, escuela, carrera, new Date(System.currentTimeMillis()));
            EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");
            en.insert(persona, prod);
            
            return "Encuesta";
            
    }
    
    public static void main(String[] args){
            EncuestaAction enc = new EncuestaAction();
            enc.run(null, null);
    }
}
