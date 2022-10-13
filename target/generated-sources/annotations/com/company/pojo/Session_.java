package com.company.pojo;

import com.company.pojo.Lobbysession;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(Session.class)
public class Session_ { 

    public static volatile SingularAttribute<Session, String> name;
    public static volatile SetAttribute<Session, Lobbysession> lobbysessionSet;
    public static volatile SingularAttribute<Session, Integer> id;

}