package sunwell.entity;

import javax.persistence.*;

/**
 * @author Aditia Dwi
 */
@Entity
@Table(name="dokumen")
public class Dokumen
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="dokumen_systemid_seq")
    @SequenceGenerator(name="dokumen_systemid_seq", sequenceName="dokumen_systemid_seq", allocationSize=1)
    private Integer systemid;

    @Column
    private String isi;

    @Column
    private int hewan_id;

    public Integer getSystemid()
    {
        return systemid;
    }

    public void setSystemid(Integer systemid)
    {
        this.systemid = systemid;
    }

    public String getIsi()
    {
        return isi;
    }

    public void setIsi(String isi)
    {
        this.isi = isi;
    }

    public int getHewan_id()
    {
        return hewan_id;
    }

    public void setHewan_id(int hewan_id)
    {
        this.hewan_id = hewan_id;
    }
}
