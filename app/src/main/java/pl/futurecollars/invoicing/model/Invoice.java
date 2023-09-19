package pl.futurecollars.invoicing.model;

import java.time.LocalDate;
import lombok.Data;
import java.util.List;


@Data
public class Invoice {

  private int id;
  private LocalDate date;
  private Company buyer;
  private Company seller;

  private List<InvoiceEntry> entries;

  public Invoice(LocalDate date, Company buyer, Company seller, List<InvoiceEntry> entries) {
    this.date = date;
    this.buyer = buyer;
    this.seller = seller;
    this.entries = entries;
  }
}