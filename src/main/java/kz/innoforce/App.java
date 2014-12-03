package kz.innoforce;

import kz.innoforce.entities.Country;
import kz.innoforce.entities.base.BaseDict;
import kz.innoforce.trans.ExcelVerifier;
import kz.innoforce.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static ExcelVerifier excelVerifier = new ExcelVerifier();

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        doStuff(session);

        session.getTransaction().commit();
    }

    private static void randomStuff(Session session) {
        excelVerifier.verifyNoSemicolon(session);
    }

    private static void doStuff(Session session) {
        randomStuff(session);

//        List<Country> topLevelCountries = getTopLevelCountries(session);
//        System.out.println("topLevelCountries = " + topLevelCountries);
    }

    public static List<Country> getTopLevelCountries(Session session) {
        return ((List<Country>) session.createQuery("From Country c where c.fowner is null").list());
    }
}
