package ej3;


import java.util.Date;

public class GetRoles {


    String msg = "";


    public String obtenerRoles (String user , String pwd){


        Date date = new Date() ;

        //PERMISSION ROLE : CRUD -  DD MM YYYY hh mm ss
        if (VerifyUser.verifyUser(user, pwd)){
            msg = "PERMISSION ROLE : " + GetPermissions.getUserPermissions(user, pwd) + "-" + date.toString();
        }else {
            msg = "Incorrect USER and PWD";
        }


        return msg;
    }
}
