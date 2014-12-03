package kz.innoforce.entities;

import kz.innoforce.entities.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:42 PM
 */
@Entity
@Table(name = "CDW_DATA")
public class Data extends BaseEntity {

    @Transient
    @Override
    public int getId() {
        return super.getId();
    }


}
