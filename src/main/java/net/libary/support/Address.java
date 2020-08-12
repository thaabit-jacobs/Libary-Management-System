package net.libary.support;

public class Address 
{
    private int houseNo;
    private String street;
    private String suburb;
    private String city;
    private int postcalCode;
    private String province;

    public Address(int houseNo, String street, String suburb, String city, int postalCode, String province)
    {
        this.houseNo = houseNo;
        this.street = street;
        this.suburb = suburb;
        this.city = city;
        this.postcalCode = postalCode;
        this.province = province;
    }

    public String getAddress()
    {
        return houseNo + " " + street + " " + suburb + " ," + city + " ," + postcalCode + " ," + province;
    }

    public void setHouseNo(int houseNo)
    {
        this.houseNo = houseNo;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public void setSuburb(String suburb)
    {
        this.suburb = suburb;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setPostalCode(int postalCode)
    {
        this.postcalCode = postalCode;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }
}