package BLL;

import BLL.Fatura1;
import BLL.Filmi;
import BLL.Puntori;
import BLL.Rezervimi;
import BLL.Salla;
import BLL.Ushqimet;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-28T03:39:59")
@StaticMetamodel(Kinema.class)
public class Kinema_ { 

    public static volatile SingularAttribute<Kinema, String> emri;
    public static volatile SingularAttribute<Kinema, Integer> zip;
    public static volatile CollectionAttribute<Kinema, Salla> sallaCollection;
    public static volatile CollectionAttribute<Kinema, Filmi> filmiCollection;
    public static volatile SingularAttribute<Kinema, String> rruga;
    public static volatile CollectionAttribute<Kinema, Rezervimi> rezervimiCollection;
    public static volatile SingularAttribute<Kinema, Integer> kinemaID;
    public static volatile CollectionAttribute<Kinema, Fatura1> fatura1Collection;
    public static volatile CollectionAttribute<Kinema, Puntori> puntoriCollection;
    public static volatile SingularAttribute<Kinema, String> qyteti;
    public static volatile CollectionAttribute<Kinema, Ushqimet> ushqimetCollection;

}