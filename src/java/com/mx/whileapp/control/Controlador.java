/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.whileapp.control;

import com.mx.whileapp.dao.EncPersonaDAO;
import com.mx.whileapp.dao.EncPersonaDTO;
import com.mx.whileapp.dao.EncProductoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author jiza
 */
public class Controlador extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
//            RequestDispatcher despachador = null;
//            String nombre = request.getParameter("nombre");
//            String escuela = request.getParameter("escuela");
//            String carrera = request.getParameter("carrera");
//            
//            String[] checkedIds = request.getParameterValues("selection");
//            List<String> values = Arrays.asList("resistor", "cable_dupont", "sensor_340k", "l293d", "l298p", "l298nh", "qrd1114", "cny70", "tcrt5000", "placa_fenolica", "protoboard", "baterias_lipo", "pic", "avr", "led", "matriz");
//            out.println(values.contains("resistosr"));
//            for (int i = 0; i < checkedIds.length; i++)
//                out.println(checkedIds[i]);
//            out.println(request.getParameter("otros"));
//            
//            Map<String, Boolean> nombreMap = new HashMap<String, Boolean>();
            
        EncuestaAction enc = new EncuestaAction();
            enc.run(null, null);
            
//            EncPersonaDTO persona = new EncPersonaDTO(nombre, escuela, carrera, new Date(System.currentTimeMillis()));
//            EncProductoDTO prod = new EncProductoDTO(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "PruebaHimernate");
//            en.insert(persona, prod);
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
