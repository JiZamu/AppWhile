/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.whileapp.hibernate;

import com.mx.whileapp.hibernate.mapping.EncPersona;
import org.hibernate.Session;

public class Test {
    public static void main(String[] args){
        Session session = HibernateSessionFactory.getSession();
        
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
        EncPersona per = (EncPersona)session.get(EncPersona.class, 2);
        System.out.println(per.getId_persona());
        System.out.println(per.getNombre());
        System.out.println(per.getEscuela());
        System.out.println(per.getCarrera());
        System.out.println(per.getFec_entrada()); 
        System.out.println(per.getEnc_pro().getPersona());
        System.out.println(per.getEnc_pro().getId_producto());
 
        session.close();
        
    }
}
