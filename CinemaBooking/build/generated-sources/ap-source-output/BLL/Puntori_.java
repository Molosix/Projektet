package BLL;

import BLL.Kinema;
import BLL.Rezervimi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-28T03:39:59")
@StaticMetamodel(Puntori.class)
public class Puntori_ { 

    public static volatile SingularAttribute<Puntori, String> emri;
    public static volatile SingularAttribute<Puntori, String> autoriteti;
    public static volatile SingularAttribute<Puntori, String> password;
    public static volatile CollectionAttribute<Puntori, Rezervimi> rezervimiCollection;
    public static volatile SingularAttribute<Puntori, Kinema> kinema;
    public static volatile SingularAttribute<Puntori, String> mbiemri;
    public static volatile SingularAttribute<Puntori, Integer> puntoriId;
    public static volatile SingularAttribute<Puntori, String> username;

}