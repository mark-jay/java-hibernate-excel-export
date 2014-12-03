package kz.innoforce.entities;

import kz.innoforce.entities.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author magzhan.karasayev
 * @since 12/3/14 6:42 PM
 */
@Entity
@Table(name = "CDW_DATA")
public class Data extends BaseEntity implements Serializable {

    private Country country;
    private Indicator indicator;
    private Type type;
    private Unit unit;

    @Transient
    @Override
    public int getId() {
        return super.getId();
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_KEY")
    @Id
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IND_KEY")
    @Id
    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_KEY")
    @Id
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UNIT_KEY")
    @Id
    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
