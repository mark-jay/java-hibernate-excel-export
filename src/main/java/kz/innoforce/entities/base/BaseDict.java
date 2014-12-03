package kz.innoforce.entities.base;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:34 PM
 */
@MappedSuperclass
public class BaseDict extends BaseEntity {
    private String name;

    public BaseDict() {
    }

    public BaseDict(int id, String name) {
        super(id);
        this.name = name;
    }

    @Id
    @Column(name = "FKEY", unique = true, nullable = false, precision = 5, scale = 0)
    @Override
    public int getId() {
        return super.getId();
    }

    @Column(name = "FNAME", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
