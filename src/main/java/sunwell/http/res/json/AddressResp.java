package sunwell.http.res.json;

/**
 * @author Aditia Dwi
 */
public class AddressResp
{
    private String street;
    private String city;
    private String country;
    private SubAddressResp subAddr;

    public AddressResp()
    {
        subAddr = new SubAddressResp();
        subAddr.setRt("01");
        subAddr.setRw("05");
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public SubAddressResp getSubAddr()
    {
        return subAddr;
    }

    public void setSubAddr(SubAddressResp subAddr)
    {
        this.subAddr = subAddr;
    }
}
