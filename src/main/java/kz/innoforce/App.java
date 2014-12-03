package kz.innoforce;

import kz.innoforce.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        doStuff(session);

        session.getTransaction().commit();
    }

    private static void doStuff(Session session) {
        Query q = session.createQuery("select count(*) From Data");

        System.out.println("q.list().size() = " + q.list().size());
    }
}
