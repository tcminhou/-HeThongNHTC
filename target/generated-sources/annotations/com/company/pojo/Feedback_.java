package com.company.pojo;

import com.company.pojo.Receipt;
import com.company.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(Feedback.class)
public class Feedback_ { 

    public static volatile SingularAttribute<Feedback, Date> date;
    public static volatile SingularAttribute<Feedback, String> comment;
    public static volatile SingularAttribute<Feedback, Integer> id;
    public static volatile SingularAttribute<Feedback, Receipt> idReceipt;
    public static volatile SingularAttribute<Feedback, User> idCustomer;

}