package com.company.pojo;

import com.company.pojo.Restaurant;
import com.company.pojo.Servicedetail;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(Service.class)
public class Service_ { 

    public static volatile SetAttribute<Service, Servicedetail> servicedetailSet;
    public static volatile SingularAttribute<Service, String> image;
    public static volatile SingularAttribute<Service, Long> price;
    public static volatile SingularAttribute<Service, Restaurant> idRestaurant;
    public static volatile SingularAttribute<Service, String> name;
    public static volatile SingularAttribute<Service, Integer> id;

}