package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "SUBSCRIBER")
public class Subscriber {

    @Id
    private Long subscId;
    private String subscName;
    private String subscSurname;
    private String msisdn;
    private Long tariffId;
    private Date startDate;

    // Getters and Setters
    public Long getSubscId() {
        return subscId;
    }

    public void setSubscId(Long subscId) {
        this.subscId = subscId;
    }

    public String getSubscName() {
        return subscName;
    }

    public void setSubscName(String subscName) {
        this.subscName = subscName;
    }

    public String getSubscSurname() {
        return subscSurname;
    }

    public void setSubscSurname(String subscSurname) {
        this.subscSurname = subscSurname;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Long getTariffId() {
        return tariffId;
    }

    public void setTariffId(Long tariffId) {
        this.tariffId = tariffId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
