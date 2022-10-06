package com.company.pojo;

import com.company.pojo.Lobbysession;
import com.company.pojo.Receipt;
import com.company.pojo.Restaurant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-05T14:39:55")
@StaticMetamodel(Lobby.class)
public class Lobby_ { 

    public static volatile SingularAttribute<Lobby, String> image;
    public static volatile SetAttribute<Lobby, Receipt> receiptSet;
    public static volatile SingularAttribute<Lobby, Long> price;
    public static volatile SingularAttribute<Lobby, Restaurant> idRestaurant;
    public static volatile SingularAttribute<Lobby, String> name;
    public static volatile SetAttribute<Lobby, Lobbysession> lobbysessionSet;
    public static volatile SingularAttribute<Lobby, Integer> qtytable;
    public static volatile SingularAttribute<Lobby, Integer> id;

}