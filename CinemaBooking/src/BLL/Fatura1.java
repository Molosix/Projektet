/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Fatura1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fatura1.findAll", query = "SELECT f FROM Fatura1 f"),
    @NamedQuery(name = "Fatura1.findByFaturaID", query = "SELECT f FROM Fatura1 f WHERE f.faturaID = :faturaID"),
    @NamedQuery(name = "Fatura1.findByTvsh", query = "SELECT f FROM Fatura1 f WHERE f.tvsh = :tvsh")})
public class Fatura1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FaturaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer faturaID;
    @Basic(optional = false)
    @Column(name = "TVSH")
    private double tvsh;
    @JoinColumn(name = "Filmi", referencedColumnName = "FilmiId")
    @ManyToOne
    private Filmi filmi;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;
    @JoinColumn(name = "Ushqimet", referencedColumnName = "UshqimiID")
    @ManyToOne
    private Ushqimet ushqimet;

    public Fatura1() {
    }

    public Fatura1(Integer faturaID) {
        this.faturaID = faturaID;
    }

    public Fatura1(Integer faturaID, double tvsh) {
        this.faturaID = faturaID;
        this.tvsh = tvsh;
    }

    public Integer getFaturaID() {
        return faturaID;
    }

    public void setFaturaID(Integer faturaID) {
        this.faturaID = faturaID;
    }

    public double getTvsh() {
        return tvsh;
    }

    public void setTvsh(double tvsh) {
        this.tvsh = tvsh;
    }

    public Filmi getFilmi() {
        return filmi;
    }

    public void setFilmi(Filmi filmi) {
        this.filmi = filmi;
    }

    public Kinema getKinema() {
        return kinema;
    }

    public void setKinema(Kinema kinema) {
        this.kinema = kinema;
    }

    public Ushqimet getUshqimet() {
        return ushqimet;
    }

    public void setUshqimet(Ushqimet ushqimet) {
        this.ushqimet = ushqimet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (faturaID != null ? faturaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fatura1)) {
            return false;
        }
        Fatura1 other = (Fatura1) object;
        if ((this.faturaID == null && other.faturaID != null) || (this.faturaID != null && !this.faturaID.equals(other.faturaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Fatura1[ faturaID=" + faturaID + " ]";
    }
    
}
