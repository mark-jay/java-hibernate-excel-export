package kz.innoforce.entities.base;

import javax.persistence.MappedSuperclass;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:34 PM
 */
@MappedSuperclass
public class BaseEntity {
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
