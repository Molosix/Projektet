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
@Table(name = "Rezervimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rezervimi.findAll", query = "SELECT r FROM Rezervimi r"),
    @NamedQuery(name = "Rezervimi.findByRezervimiId", query = "SELECT r FROM Rezervimi r WHERE r.rezervimiId = :rezervimiId"),
    @NamedQuery(name = "Rezervimi.findByUlsja", query = "SELECT r FROM Rezervimi r WHERE r.ulsja = :ulsja"),
    @NamedQuery(name = "Rezervimi.findByCmimi", query = "SELECT r FROM Rezervimi r WHERE r.cmimi = :cmimi")})
public class Rezervimi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RezervimiId")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer rezervimiId;
    @Basic(optional = false)
    @Column(name = "ulsja")
    private String ulsja;
    @Basic(optional = false)
    @Column(name = "cmimi")
    private double cmimi;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;
    @JoinColumn(name = "puntori", referencedColumnName = "PuntoriId")
    @ManyToOne
    private Puntori puntori;

    public Rezervimi() {
    }

    public Rezervimi(Integer rezervimiId) {
        this.rezervimiId = rezervimiId;
    }

    public Rezervimi(Integer rezervimiId, String ulsja, double cmimi) {
        this.rezervimiId = rezervimiId;
        this.ulsja = ulsja;
        this.cmimi = cmimi;
    }

    public Integer getRezervimiId() {
        return rezervimiId;
    }

    public void setRezervimiId(Integer rezervimiId) {
        this.rezervimiId = rezervimiId;
    }

    public String getUlsja() {
        return ulsja;
    }

    public void setUlsja(String ulsja) {
        this.ulsja = ulsja;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public Kinema getKinema() {
        return kinema;
    }

    public void setKinema(Kinema kinema) {
        this.kinema = kinema;
    }

    public Puntori getPuntori() {
        return puntori;
    }

    public void setPuntori(Puntori puntori) {
        this.puntori = puntori;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rezervimiId != null ? rezervimiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rezervimi)) {
            return false;
        }
        Rezervimi other = (Rezervimi) object;
        if ((this.rezervimiId == null && other.rezervimiId != null) || (this.rezervimiId != null && !this.rezervimiId.equals(other.rezervimiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Rezervimi[ rezervimiId=" + rezervimiId + " ]";
    }
    
}
