/*
 * Kadal.java
 * Created on 2/10/20, 4:20 PM
 *
 * Copyright (c) 2020. Sunwell System CV, Bandung, Indonesia.
 */

package sunwell.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Aditia Dwi
 */
@Entity
@Table(name="kadal")
public class Kadal extends Hewan
{
    @Column
    private String warna;

    public String getWarna()
    {
        return warna;
    }

    public void setWarna(String warna)
    {
        this.warna = warna;
    }
}
