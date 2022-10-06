package com.company.pojo;

import com.company.pojo.Receipt;
import com.company.pojo.Service;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-05T14:39:55")
@StaticMetamodel(Servicedetail.class)
public class Servicedetail_ { 

    public static volatile SingularAttribute<Servicedetail, Long> price;
    public static volatile SingularAttribute<Servicedetail, Service> idService;
    public static volatile SingularAttribute<Servicedetail, Integer> id;
    public static volatile SingularAttribute<Servicedetail, Receipt> idReceipt;

}