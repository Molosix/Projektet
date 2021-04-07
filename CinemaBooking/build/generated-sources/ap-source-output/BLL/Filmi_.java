package BLL;

import BLL.Fatura1;
import BLL.Kinema;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-28T03:39:59")
@StaticMetamodel(Filmi.class)
public class Filmi_ { 

    public static volatile CollectionAttribute<Filmi, Fatura1> fatura1Collection;
    public static volatile SingularAttribute<Filmi, Kinema> kinema;
    public static volatile SingularAttribute<Filmi, String> description;
    public static volatile SingularAttribute<Filmi, String> titulli;
    public static volatile SingularAttribute<Filmi, Integer> filmiId;
    public static volatile SingularAttribute<Filmi, String> koha;

}