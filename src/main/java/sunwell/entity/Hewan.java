/*
 * Hewan.java
 * Created on 2/10/20, 4:18 PM
 *
 * Copyright (c) 2020. Sunwell System CV, Bandung, Indonesia.
 */

package sunwell.entity;

import javax.persistence.*;

/**
 * @author Aditia Dwi
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="hewan")
public class Hewan
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hewan_id_seq")
    @SequenceGenerator(name = "hewan_id_seq", sequenceName = "hewan_id_seq", allocationSize = 1)
    private Integer id;

    @Column
    private String nama;

    @Column(name="jml_kaki")
    private int jmlKaki;

    @Column(name="is_amfibi")
    private boolean isAmfibi;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public int getJmlKaki()
    {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki)
    {
        this.jmlKaki = jmlKaki;
    }

    public boolean isAmfibi()
    {
        return isAmfibi;
    }

    public void setAmfibi(boolean amfibi)
    {
        isAmfibi = amfibi;
    }
}
