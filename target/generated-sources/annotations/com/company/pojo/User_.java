package com.company.pojo;

import com.company.pojo.Feedback;
import com.company.pojo.Receipt;
import com.company.pojo.Restaurant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> image;
    public static volatile SetAttribute<User, Receipt> receiptSet;
    public static volatile SingularAttribute<User, String> firstname;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SetAttribute<User, Feedback> feedbackSet;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, String> userrole;
    public static volatile SingularAttribute<User, String> lastname;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;
    public static volatile SetAttribute<User, Restaurant> restaurantSet;

}