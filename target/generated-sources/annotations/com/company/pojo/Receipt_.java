package com.company.pojo;

import com.company.pojo.Feedback;
import com.company.pojo.Lobby;
import com.company.pojo.Menu;
import com.company.pojo.Restaurant;
import com.company.pojo.Servicedetail;
import com.company.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-05T14:39:55")
@StaticMetamodel(Receipt.class)
public class Receipt_ { 

    public static volatile SetAttribute<Receipt, Servicedetail> servicedetailSet;
    public static volatile SingularAttribute<Receipt, Long> total;
    public static volatile SingularAttribute<Receipt, Integer> quantity;
    public static volatile SingularAttribute<Receipt, Date> organizationdate;
    public static volatile SetAttribute<Receipt, Feedback> feedbackSet;
    public static volatile SingularAttribute<Receipt, Restaurant> idRestaurant;
    public static volatile SingularAttribute<Receipt, Menu> idMenu;
    public static volatile SingularAttribute<Receipt, String> active;
    public static volatile SingularAttribute<Receipt, Integer> id;
    public static volatile SingularAttribute<Receipt, Date> orderdate;
    public static volatile SingularAttribute<Receipt, Lobby> idLobby;
    public static volatile SingularAttribute<Receipt, User> idCustomer;

}