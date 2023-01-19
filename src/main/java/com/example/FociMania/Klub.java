package com.example.FociMania;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "klub")
public class Klub {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCsapatnev() {
        return csapatnev;
    }

    public void setCsapatnev(String csapatnev) {
        this.csapatnev = csapatnev;
    }

    @Id
    private int id;
    @Column(name = "csapatnev")
    private String csapatnev;

}
