package com.company.pojo;

import com.company.pojo.Lobby;
import com.company.pojo.Session;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-10-13T20:45:28")
@StaticMetamodel(Lobbysession.class)
public class Lobbysession_ { 

    public static volatile SingularAttribute<Lobbysession, Date> date;
    public static volatile SingularAttribute<Lobbysession, Long> price;
    public static volatile SingularAttribute<Lobbysession, Integer> id;
    public static volatile SingularAttribute<Lobbysession, Session> idSession;
    public static volatile SingularAttribute<Lobbysession, Lobby> idLobby;

}