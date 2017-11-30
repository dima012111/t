package com.example.t10.entity;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Cursa implements Serializable {
    private Integer idCursa;
    private String plecare;
    private String sosire;
    private Date data;
    private Time ora;
    private Double pret;
    private Integer locuri;

    @Id
    @Column(name = "id_Cursa", nullable = false)
    public Integer getIdCursa() {
        return idCursa;
    }

    public void setIdCursa(Integer idCursa) {
        this.idCursa = idCursa;
    }

    @Basic
    @Column(name = "Plecare", nullable = true, length = 45)
    public String getPlecare() {
        return plecare;
    }

    public void setPlecare(String plecare) {
        this.plecare = plecare;
    }

    @Basic
    @Column(name = "Sosire", nullable = true, length = 45)
    public String getSosire() {
        return sosire;
    }

    public void setSosire(String sosire) {
        this.sosire = sosire;
    }

    @Basic
    @Column(name = "Data", nullable = true)
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Basic
    @Column(name = "Ora", nullable = true)
    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }

    @Basic
    @Column(name = "Pret", nullable = true, precision = 0)
    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Basic
    @Column(name = "Locuri", nullable = true)
    public Integer getLocuri() {
        return locuri;
    }

    public void setLocuri(Integer locuri) {
        this.locuri = locuri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cursa cursa = (Cursa) o;

        if (idCursa != null ? !idCursa.equals(cursa.idCursa) : cursa.idCursa != null) return false;
        if (plecare != null ? !plecare.equals(cursa.plecare) : cursa.plecare != null) return false;
        if (sosire != null ? !sosire.equals(cursa.sosire) : cursa.sosire != null) return false;
        if (data != null ? !data.equals(cursa.data) : cursa.data != null) return false;
        if (ora != null ? !ora.equals(cursa.ora) : cursa.ora != null) return false;
        if (pret != null ? !pret.equals(cursa.pret) : cursa.pret != null) return false;
        if (locuri != null ? !locuri.equals(cursa.locuri) : cursa.locuri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCursa != null ? idCursa.hashCode() : 0;
        result = 31 * result + (plecare != null ? plecare.hashCode() : 0);
        result = 31 * result + (sosire != null ? sosire.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (ora != null ? ora.hashCode() : 0);
        result = 31 * result + (pret != null ? pret.hashCode() : 0);
        result = 31 * result + (locuri != null ? locuri.hashCode() : 0);
        return result;
    }
}
