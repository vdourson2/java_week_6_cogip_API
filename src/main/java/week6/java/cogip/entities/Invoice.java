package week6.java.cogip.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
public class Invoice {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private short id;
  
  @Column(name = "timestamp", nullable = false, updatable = false, insertable = false)
  private String timestamp;
  
  @ManyToOne(
          cascade = {
                  CascadeType.PERSIST,
                  CascadeType.MERGE
          },
          fetch = FetchType.EAGER
  )
  @JsonIgnoreProperties(value = { "contacts","invoices" })
  @JoinColumn(name = "invoice_company_id")
  private Company company;
  
  @ManyToOne(
          cascade = {
                  CascadeType.PERSIST,
                  CascadeType.MERGE
          },
          fetch = FetchType.EAGER
  )
  @JsonIgnoreProperties(value = { "company","invoices" })
  @JoinColumn(name = "invoice_contact_id")
  private Contact contact;
  
  public Invoice(short id, String timestamp, Company company, Contact contact) {
    this.id = id;
    this.timestamp = timestamp;
    this.company = company;
    //this.contact = contact;
  }
  
  public Invoice() {
  
  }
  
}
