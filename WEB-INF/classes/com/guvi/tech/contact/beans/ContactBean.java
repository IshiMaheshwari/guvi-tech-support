package com.guvi.tech.contact.beans;
public class ContactBean implements java.io.Serializable,Comparable<ContactBean>
{
private String name;
private String address;
public ContactBean()
{ 
this.name="";
this.address="";
}
public void setName(String name)
{ 
this.name=name;
}
public String getName()
{
return this.name;
}
public void setAddress(String address)
{ 
this.address=address;
}
public String getAddress()
{
return this.address;
}
public boolean equals(Object object)
{ 
if(!(object instanceof ContactBean)) return false;
ContactBean other=(ContactBean)object;
return this.name.equals(other.name);
}
public int compareTo(ContactBean other)
{
return this.name.compareToIgnoreCase(other.name);
}
public int hashName()
{
return name.hashCode();
}
}