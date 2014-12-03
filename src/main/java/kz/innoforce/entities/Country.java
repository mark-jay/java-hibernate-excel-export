package kz.innoforce.entities;


import kz.innoforce.entities.base.BaseDict;

import javax.persistence.*;
import java.util.List;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:21 PM
 */
@Entity
@Table(name = "CDW_COUNTRIES")
public class Country extends BaseDict {
    private Country fowner;
    private List<Country> children;

    @ManyToOne
    @JoinColumn(name = "FOWNER")
    public Country getFowner() {
        return fowner;
    }

    public void setFowner(Country fowner) {
        this.fowner = fowner;
    }

    @OneToMany(cascade={})
    @JoinColumn(name="FOWNER")
    public List<Country> getChildren() {
        return children;
    }

    public void setChildren(List<Country> children) {
        this.children = children;
    }
}
