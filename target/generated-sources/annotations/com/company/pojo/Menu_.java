package com.company.pojo;

import com.company.pojo.Receipt;
import com.company.pojo.Restaurant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> maincourse3;
    public static volatile SingularAttribute<Menu, String> maincourse2;
    public static volatile SingularAttribute<Menu, String> image;
    public static volatile SetAttribute<Menu, Receipt> receiptSet;
    public static volatile SingularAttribute<Menu, String> maincourse1;
    public static volatile SingularAttribute<Menu, String> dessert;
    public static volatile SingularAttribute<Menu, Restaurant> idRestaurant;
    public static volatile SingularAttribute<Menu, Long> price;
    public static volatile SingularAttribute<Menu, String> drinks;
    public static volatile SingularAttribute<Menu, String> appetizer;
    public static volatile SingularAttribute<Menu, String> name;
    public static volatile SingularAttribute<Menu, Integer> id;

}