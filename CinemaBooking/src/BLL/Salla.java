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
@Table(name = "Salla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salla.findAll", query = "SELECT s FROM Salla s"),
    @NamedQuery(name = "Salla.findBySallaId", query = "SELECT s FROM Salla s WHERE s.sallaId = :sallaId"),
    @NamedQuery(name = "Salla.findByEmri", query = "SELECT s FROM Salla s WHERE s.emri = :emri"),
    @NamedQuery(name = "Salla.findByKapaciteti", query = "SELECT s FROM Salla s WHERE s.kapaciteti = :kapaciteti")})
public class Salla implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SallaId")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer sallaId;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "kapaciteti")
    private int kapaciteti;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;

    public Salla() {
    }

    public Salla(Integer sallaId) {
        this.sallaId = sallaId;
    }

    public Salla(Integer sallaId, String emri, int kapaciteti) {
        this.sallaId = sallaId;
        this.emri = emri;
        this.kapaciteti = kapaciteti;
    }

    public Integer getSallaId() {
        return sallaId;
    }

    public void setSallaId(Integer sallaId) {
        this.sallaId = sallaId;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getKapaciteti() {
        return kapaciteti;
    }

    public void setKapaciteti(int kapaciteti) {
        this.kapaciteti = kapaciteti;
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
        hash += (sallaId != null ? sallaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salla)) {
            return false;
        }
        Salla other = (Salla) object;
        if ((this.sallaId == null && other.sallaId != null) || (this.sallaId != null && !this.sallaId.equals(other.sallaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Salla[ sallaId=" + sallaId + " ]";
    }
    
}
