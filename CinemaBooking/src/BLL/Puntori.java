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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Puntori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntori.findAll", query = "SELECT p FROM Puntori p"),
    @NamedQuery(name = "Puntori.findByPuntoriId", query = "SELECT p FROM Puntori p WHERE p.puntoriId = :puntoriId"),
    @NamedQuery(name = "Puntori.findByEmri", query = "SELECT p FROM Puntori p WHERE p.emri = :emri"),
    @NamedQuery(name = "Puntori.findByMbiemri", query = "SELECT p FROM Puntori p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Puntori.findByUsername", query = "SELECT p FROM Puntori p WHERE p.username = :username"),
    @NamedQuery(name = "Puntori.findByPassword", query = "SELECT p FROM Puntori p WHERE p.password = :password"),
    @NamedQuery(name = "Puntori.findByAutoriteti", query = "SELECT p FROM Puntori p WHERE p.autoriteti = :autoriteti")})
public class Puntori implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PuntoriId")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer puntoriId;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "autoriteti")
    private String autoriteti;
    @OneToMany(mappedBy = "puntori")
    private Collection<Rezervimi> rezervimiCollection;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;

    public Puntori() {
    }

    public Puntori(Integer puntoriId) {
        this.puntoriId = puntoriId;
    }

    public Puntori(Integer puntoriId, String emri, String mbiemri, String username, String password, String autoriteti) {
        this.puntoriId = puntoriId;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.username = username;
        this.password = password;
        this.autoriteti = autoriteti;
    }

    public Integer getPuntoriId() {
        return puntoriId;
    }

    public void setPuntoriId(Integer puntoriId) {
        this.puntoriId = puntoriId;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAutoriteti() {
        return autoriteti;
    }

    public void setAutoriteti(String autoriteti) {
        this.autoriteti = autoriteti;
    }

    @XmlTransient
    public Collection<Rezervimi> getRezervimiCollection() {
        return rezervimiCollection;
    }

    public void setRezervimiCollection(Collection<Rezervimi> rezervimiCollection) {
        this.rezervimiCollection = rezervimiCollection;
    }

    public Kinema getKinema() {
        return kinema;
    }

    public void setKinema(Kinema kinema) {
        this.kinema = kinema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (puntoriId != null ? puntoriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puntori)) {
            return false;
        }
        Puntori other = (Puntori) object;
        if ((this.puntoriId == null && other.puntoriId != null) || (this.puntoriId != null && !this.puntoriId.equals(other.puntoriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Puntori[ puntoriId=" + puntoriId + " ]";
    }
    
}
