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
@Table(name = "Ushqimet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ushqimet.findAll", query = "SELECT u FROM Ushqimet u"),
    @NamedQuery(name = "Ushqimet.findByUshqimiID", query = "SELECT u FROM Ushqimet u WHERE u.ushqimiID = :ushqimiID"),
    @NamedQuery(name = "Ushqimet.findByLloji", query = "SELECT u FROM Ushqimet u WHERE u.lloji = :lloji")})
public class Ushqimet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UshqimiID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer ushqimiID;
    @Basic(optional = false)
    @Column(name = "Lloji")
    private String lloji;
    @OneToMany(mappedBy = "ushqimet")
    private Collection<Fatura1> fatura1Collection;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;

    public Ushqimet() {
    }

    public Ushqimet(Integer ushqimiID) {
        this.ushqimiID = ushqimiID;
    }

    public Ushqimet(Integer ushqimiID, String lloji) {
        this.ushqimiID = ushqimiID;
        this.lloji = lloji;
    }

    public Integer getUshqimiID() {
        return ushqimiID;
    }

    public void setUshqimiID(Integer ushqimiID) {
        this.ushqimiID = ushqimiID;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    @XmlTransient
    public Collection<Fatura1> getFatura1Collection() {
        return fatura1Collection;
    }

    public void setFatura1Collection(Collection<Fatura1> fatura1Collection) {
        this.fatura1Collection = fatura1Collection;
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
        hash += (ushqimiID != null ? ushqimiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ushqimet)) {
            return false;
        }
        Ushqimet other = (Ushqimet) object;
        if ((this.ushqimiID == null && other.ushqimiID != null) || (this.ushqimiID != null && !this.ushqimiID.equals(other.ushqimiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Ushqimet[ ushqimiID=" + ushqimiID + " ]";
    }
    
}
