package com.guvi.tech.contact.dl;
public class ContactDTO implements java.io.Serializable,Comparable<ContactDTO>
{
private String name;
private String address;
public ContactDTO()
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
if(!(object instanceof ContactDTO)) return false;
ContactDTO other=(ContactDTO)object;
return this.name.equals(other.name);
}
public int compareTo(ContactDTO other)
{
return this.name.compareToIgnoreCase(other.name);
}
public int hashName()
{
return name.hashCode();
}
}