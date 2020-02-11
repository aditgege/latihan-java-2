/*
 * ${NAME}
 * Created on 2/10/20, 5:05 PM
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
@Table(name="burungsuper")
public class BurungSuper extends Burung
{
    @Column
    private String kekuatan;

    public String getKekuatan()
    {
        return kekuatan;
    }

    public void setKekuatan(String kekuatan)
    {
        this.kekuatan = kekuatan;
    }
}
