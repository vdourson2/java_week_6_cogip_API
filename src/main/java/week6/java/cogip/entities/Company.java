package week6.java.cogip.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
    @Id
    private short id;
    private String name;
    private String country;
    private String vat;
    private String type;
    private String timestamp;

    public Company() {

    }

    public Company(short id, String name, String country, String tva, String type, String timestamp) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.vat = tva;
        this.type = type;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String tva) {
        this.vat = tva;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
