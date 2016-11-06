package com.project.until;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;


/**
 * Created by leonel on 26/10/16.
 */


@Named
@SessionScoped
public class DbiHandler implements Serializable{


    private String strConexion = "jdbc/mysql://localhost:3306/ejemplo";

    private String nameUser = "root";

    private String passWord = "123456";

    private String query;

    private Map<Integer,Object> param;


    public DbiHandler(){
        this.param = new HashMap();
    }


    public  Map<Integer,Object> addParan(Integer pos,Object value){
        this.param.put(pos,value);
        return this.param;
    }


    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getStrConexion() {
        return strConexion;
    }

    public void setStrConexion(String strConexion) {
        this.strConexion = strConexion;
    }
}
