package kz.innoforce.trans;

import kz.innoforce.entities.base.BaseDict;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 8:02 PM
 */
public class ExcelVerifier {
    private List<BaseDict> getListBaseDict(Session session) {
        List<BaseDict> res = new ArrayList<BaseDict>();
        res.addAll(((List<BaseDict>) session.createQuery("From Country").list()));
        res.addAll(((List<BaseDict>) session.createQuery("From Indicator").list()));
        res.addAll(((List<BaseDict>) session.createQuery("From Type").list()));
        res.addAll(((List<BaseDict>) session.createQuery("From Unit").list()));
        return res;
    }

    public void verifyNoSemicolon(Session session) {
        List<BaseDict> list = getListBaseDict(session);
        for (BaseDict bd : list) {
            if (bd.getName().contains(";")) {
                System.out.println("bd = " + bd);
                throw new RuntimeException("assertion failed, found semicolon");
            }
        }
    }
}
