package BLL;

import BLL.Filmi;
import BLL.Kinema;
import BLL.Ushqimet;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-28T03:39:59")
@StaticMetamodel(Fatura1.class)
public class Fatura1_ { 

    public static volatile SingularAttribute<Fatura1, Double> tvsh;
    public static volatile SingularAttribute<Fatura1, Kinema> kinema;
    public static volatile SingularAttribute<Fatura1, Integer> faturaID;
    public static volatile SingularAttribute<Fatura1, Filmi> filmi;
    public static volatile SingularAttribute<Fatura1, Ushqimet> ushqimet;

}