package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class portfolio
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long portfolioId;

    @OneToOne(mappedBy = "clientId")
    private Client client;

    @OneToMany
    private List<Security> securities;

    @Column(nullable = false)
    private Date date;

    public portfolio(List<Security> securities, Date date) {
        this.securities = securities;
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
