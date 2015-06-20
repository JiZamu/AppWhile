package com.mx.whileapp.hibernate;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionFactory {
    public static String CONFIG_FILE = "/Users/jiza/Documents/proyectos_java/AppWhile/src/java/hibernate.cfg.xml";
    private static SessionFactory sessionf = null;
    private static Session session = null;
    
    public static Session getSession(){
        if(session == null || !session.isOpen()){
            File file = new File(CONFIG_FILE);
            sessionf = new AnnotationConfiguration().configure(file).buildSessionFactory();
            session = sessionf.openSession();
        }
        
        return session;
    }
}
