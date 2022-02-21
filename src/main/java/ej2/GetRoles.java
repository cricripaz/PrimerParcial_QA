package ej2;

import java.util.Date;

public class GetRoles {


    VerifyUser verifyUser;
    GetPermissions getPermissions;


    String msg = "";


    public GetRoles(VerifyUser verifyUserMockeado , GetPermissions getPermissionsMockeado){

        verifyUser =  verifyUserMockeado;
        getPermissions = getPermissionsMockeado;

    }







    public String obtenerRoles (String user , String pwd){


        Date date = new Date() ;

        //PERMISSION ROLE : CRUD -  DD MM YYYY hh mm ss
        if (verifyUser.verifyUser(user, pwd)){
            msg = "PERMISSION ROLE : " + getPermissions.getUserPermissions(user, pwd) + "-" + date.toString();
        }else {
            msg = "Incorrect USER and PWD";
        }


        return msg;
    }


}
