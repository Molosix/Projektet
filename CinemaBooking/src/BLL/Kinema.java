/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "Kinema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kinema.findAll", query = "SELECT k FROM Kinema k"),
    @NamedQuery(name = "Kinema.findByKinemaID", query = "SELECT k FROM Kinema k WHERE k.kinemaID = :kinemaID"),
    @NamedQuery(name = "Kinema.findByEmri", query = "SELECT k FROM Kinema k WHERE k.emri = :emri"),
    @NamedQuery(name = "Kinema.findByQyteti", query = "SELECT k FROM Kinema k WHERE k.qyteti = :qyteti"),
    @NamedQuery(name = "Kinema.findByRruga", query = "SELECT k FROM Kinema k WHERE k.rruga = :rruga"),
    @NamedQuery(name = "Kinema.findByZip", query = "SELECT k FROM Kinema k WHERE k.zip = :zip")})
public class Kinema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KinemaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer kinemaID;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "qyteti")
    private String qyteti;
    @Basic(optional = false)
    @Column(name = "rruga")
    private String rruga;
    @Basic(optional = false)
    @Column(name = "zip")
    private int zip;
    @OneToMany(mappedBy = "kinema")
    private Collection<Rezervimi> rezervimiCollection;
    @OneToMany(mappedBy = "kinema")
    private Collection<Fatura1> fatura1Collection;
    @OneToMany(mappedBy = "kinema")
    private Collection<Puntori> puntoriCollection;
    @OneToMany(mappedBy = "kinema")
    private Collection<Ushqimet> ushqimetCollection;
    @OneToMany(mappedBy = "kinema")
    private Collection<Salla> sallaCollection;
    @OneToMany(mappedBy = "kinema")
    private Collection<Filmi> filmiCollection;

    public Kinema() {
    }

    public Kinema(Integer kinemaID) {
        this.kinemaID = kinemaID;
    }

    public Kinema(Integer kinemaID, String emri, String qyteti, String rruga, int zip) {
        this.kinemaID = kinemaID;
        this.emri = emri;
        this.qyteti = qyteti;
        this.rruga = rruga;
        this.zip = zip;
    }

    public Integer getKinemaID() {
        return kinemaID;
    }

    public void setKinemaID(Integer kinemaID) {
        this.kinemaID = kinemaID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getRruga() {
        return rruga;
    }

    public void setRruga(String rruga) {
        this.rruga = rruga;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @XmlTransient
    public Collection<Rezervimi> getRezervimiCollection() {
        return rezervimiCollection;
    }

    public void setRezervimiCollection(Collection<Rezervimi> rezervimiCollection) {
        this.rezervimiCollection = rezervimiCollection;
    }

    @XmlTransient
    public Collection<Fatura1> getFatura1Collection() {
        return fatura1Collection;
    }

    public void setFatura1Collection(Collection<Fatura1> fatura1Collection) {
        this.fatura1Collection = fatura1Collection;
    }

    @XmlTransient
    public Collection<Puntori> getPuntoriCollection() {
        return puntoriCollection;
    }

    public void setPuntoriCollection(Collection<Puntori> puntoriCollection) {
        this.puntoriCollection = puntoriCollection;
    }

    @XmlTransient
    public Collection<Ushqimet> getUshqimetCollection() {
        return ushqimetCollection;
    }

    public void setUshqimetCollection(Collection<Ushqimet> ushqimetCollection) {
        this.ushqimetCollection = ushqimetCollection;
    }

    @XmlTransient
    public Collection<Salla> getSallaCollection() {
        return sallaCollection;
    }

    public void setSallaCollection(Collection<Salla> sallaCollection) {
        this.sallaCollection = sallaCollection;
    }

    @XmlTransient
    public Collection<Filmi> getFilmiCollection() {
        return filmiCollection;
    }

    public void setFilmiCollection(Collection<Filmi> filmiCollection) {
        this.filmiCollection = filmiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kinemaID != null ? kinemaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kinema)) {
            return false;
        }
        Kinema other = (Kinema) object;
        if ((this.kinemaID == null && other.kinemaID != null) || (this.kinemaID != null && !this.kinemaID.equals(other.kinemaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.emri;
    }
    
}
