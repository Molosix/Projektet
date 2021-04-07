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
@Table(name = "Filmi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filmi.findAll", query = "SELECT f FROM Filmi f"),
    @NamedQuery(name = "Filmi.findByFilmiId", query = "SELECT f FROM Filmi f WHERE f.filmiId = :filmiId"),
    @NamedQuery(name = "Filmi.findByKoha", query = "SELECT f FROM Filmi f WHERE f.koha = :koha"),
    @NamedQuery(name = "Filmi.findByTitulli", query = "SELECT f FROM Filmi f WHERE f.titulli = :titulli"),
    @NamedQuery(name = "Filmi.findByDescription", query = "SELECT f FROM Filmi f WHERE f.description = :description")})
public class Filmi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FilmiId")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator( name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer filmiId;
    @Basic(optional = false)
    @Column(name = "koha")
    private String koha;
    @Basic(optional = false)
    @Column(name = "titulli")
    private String titulli;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "filmi")
    private Collection<Fatura1> fatura1Collection;
    @JoinColumn(name = "Kinema", referencedColumnName = "KinemaID")
    @ManyToOne
    private Kinema kinema;

    public Filmi() {
    }

    public Filmi(Integer filmiId) {
        this.filmiId = filmiId;
    }

    public Filmi(Integer filmiId, String koha, String titulli, String description) {
        this.filmiId = filmiId;
        this.koha = koha;
        this.titulli = titulli;
        this.description = description;
    }

    public Integer getFilmiId() {
        return filmiId;
    }

    public void setFilmiId(Integer filmiId) {
        this.filmiId = filmiId;
    }

    public String getKoha() {
        return koha;
    }

    public void setKoha(String koha) {
        this.koha = koha;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (filmiId != null ? filmiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filmi)) {
            return false;
        }
        Filmi other = (Filmi) object;
        if ((this.filmiId == null && other.filmiId != null) || (this.filmiId != null && !this.filmiId.equals(other.filmiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getTitulli();
    }
    
}
