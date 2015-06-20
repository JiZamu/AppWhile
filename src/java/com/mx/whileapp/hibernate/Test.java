/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.whileapp.hibernate;

import org.hibernate.Session;

public class Test {
    public static void main(String[] args){
        Session session = HibernateSessionFactory.getSession();
        EncPersona per = (EncPersona)session.get(EncPersona.class, 1);
        System.out.println(per.getNombre());
        System.out.println(per.getEscuela());
        System.out.println(per.getCarrera());
        System.out.println(per.getFec_entrada());
        session.close();
    }
}
