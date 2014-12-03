package kz.innoforce;

import kz.innoforce.entities.Indicator;
import kz.innoforce.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.Date;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Indicator indicator = new Indicator();

        Query q = session.createQuery("From Indicator");

        System.out.println("q.list().size() = " + q.list().size());

        session.getTransaction().commit();
    }
}
