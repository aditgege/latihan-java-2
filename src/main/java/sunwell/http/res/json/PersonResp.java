package sunwell.http.res.json;

import java.util.Date;

/**
 * @author Aditia Dwi
 */
public class PersonResp
{
    private String fullname;
    private Date birthdate;
    private String birthplace;
    private String bloodtype;
    private Iterable<AddressResp> addresses;

    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public Date getBirthdate()
    {
        return birthdate;
    }

    public void setBirthdate(Date birthdate)
    {
        this.birthdate = birthdate;
    }

    public String getBirthplace()
    {
        return birthplace;
    }

    public void setBirthplace(String birthplace)
    {
        this.birthplace = birthplace;
    }

    public String getBloodtype()
    {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype)
    {
        this.bloodtype = bloodtype;
    }

    public Iterable<AddressResp> getAddresses()
    {
        return addresses;
    }

    public void setAddresses(Iterable<AddressResp> addresses)
    {
        this.addresses = addresses;
    }
}
