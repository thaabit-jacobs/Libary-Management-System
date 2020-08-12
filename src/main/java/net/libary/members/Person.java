package net.libary.members;

import net.libary.support.*;

import java.util.UUID;

public class Person
{
        private UUID id;
        private String first_name;
        private String last_name;
        private String phone_no;
        private Address address;

        public Person(String first_name, String last_name, String phone_no, Address address)
        {
            this.id = UUID.randomUUID();
            this.first_name = first_name;
            this.last_name = last_name;
            this.phone_no = phone_no;
            this.address = address;
        }

        public UUID getId()
        {
            return id;
        }

        public String getFirstName()
        {
            return first_name;
        }

        public String getLastName()
        {
            return last_name;
        }

        public String getFullName()
        {
            return first_name + " " +last_name;
        }

        public String getPhoneNo()
        {
            return phone_no;
        }

        public Address getAddress()
        {
            return address;
        }

        public void setLastName(String last_name)
        {
            this.last_name = last_name;
        }

        public void setPhoneNo(String phone_no)
        {
            this.phone_no = phone_no;
        }        
}