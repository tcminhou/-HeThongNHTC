package com.company.pojo;

import com.company.pojo.Lobby;
import com.company.pojo.Menu;
import com.company.pojo.Receipt;
import com.company.pojo.Service;
import com.company.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-05T14:39:55")
@StaticMetamodel(Restaurant.class)
public class Restaurant_ { 

    public static volatile SingularAttribute<Restaurant, String> image;
    public static volatile SetAttribute<Restaurant, Receipt> receiptSet;
    public static volatile SingularAttribute<Restaurant, String> hotline;
    public static volatile SetAttribute<Restaurant, Lobby> lobbySet;
    public static volatile SetAttribute<Restaurant, Menu> menuSet;
    public static volatile SingularAttribute<Restaurant, String> ward;
    public static volatile SingularAttribute<Restaurant, String> road;
    public static volatile SingularAttribute<Restaurant, String> district;
    public static volatile SingularAttribute<Restaurant, String> name;
    public static volatile SingularAttribute<Restaurant, Integer> id;
    public static volatile SingularAttribute<Restaurant, User> idOwner;
    public static volatile SingularAttribute<Restaurant, String> status;
    public static volatile SetAttribute<Restaurant, Service> serviceSet;

}