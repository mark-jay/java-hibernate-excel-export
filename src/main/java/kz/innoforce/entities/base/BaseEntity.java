package kz.innoforce.entities.base;

import java.io.Serializable;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:34 PM
 */
public class BaseEntity implements Serializable {
    private int id;

    public BaseEntity() {
    }

    public BaseEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
