package ej2_test;

import ej2.GetPermissions;
import ej2.GetRoles;
import ej2.VerifyUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

public class Ej2Test {

    VerifyUser verifyUserM = Mockito.mock(VerifyUser.class);
    GetPermissions getPermissionsM = Mockito.mock(GetPermissions.class);


    String user = "melo";
    String pw = "1234";



    Date date = new Date();


    @Test
    public void verifyRoleA(){

        Mockito.when(verifyUserM.verifyUser(user,pw)).thenReturn(true);
        Mockito.when(getPermissionsM.getUserPermissions(user,pw)).thenReturn("CRUD");

        GetRoles getRoles = new GetRoles(verifyUserM,getPermissionsM);

        String actualResult = getRoles.obtenerRoles(user,pw);
        String expectedResult = "PERMISSION ROLE : CRUD" + "-" + date.toString();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }


    // PERMISSION ROLE : R -  DD MM YYYY hh mm ss
    @Test
    public void verifyRoleB(){

        Mockito.when(verifyUserM.verifyUser(user,pw)).thenReturn(true);
        Mockito.when(getPermissionsM.getUserPermissions(user,pw)).thenReturn("R");

        GetRoles getRoles = new GetRoles(verifyUserM,getPermissionsM);

        String actualResult = getRoles.obtenerRoles(user,pw);
        String expectedResult = "PERMISSION ROLE : R" + "-" + date.toString();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }

    @Test
    public void verifyRoleC(){

        Mockito.when(verifyUserM.verifyUser(user,pw)).thenReturn(false);
        Mockito.when(getPermissionsM.getUserPermissions(user,pw)).thenReturn("R");

        GetRoles getRoles = new GetRoles(verifyUserM,getPermissionsM);

        String actualResult = getRoles.obtenerRoles(user,pw);
        String expectedResult = "PERMISSION ROLE : R" + "-" + date.toString();

        Assertions.assertEquals(expectedResult,actualResult,"ERROR");

    }




}
