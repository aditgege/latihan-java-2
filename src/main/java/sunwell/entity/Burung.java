/*
 * ${NAME}
 * Created on 2/10/20, 4:46 PM
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
@Table(name="burung")
public class Burung extends Hewan
{
    @Column(name="bisa_terbang")
    private boolean bisaTerbang;

    public boolean isBisaTerbang()
    {
        return bisaTerbang;
    }

    public void setBisaTerbang(boolean bisaTerbang)
    {
        this.bisaTerbang = bisaTerbang;
    }
}
