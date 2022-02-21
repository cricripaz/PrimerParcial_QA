package ej3_test;

import ej3.GetPermissions;
import ej3.GetRoles;
import ej3.VerifyUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Date;

public class Ej3Test {


    GetRoles getRoles = new GetRoles();


    String user = "melo";
    String pwd = "123";

    Date date = new Date();


    @BeforeAll
    public static void before(){

        MockedStatic<VerifyUser> mocked = Mockito.mockStatic(VerifyUser.class);
        MockedStatic<GetPermissions> mocked2 = Mockito.mockStatic(GetPermissions.class);

        mocked.when(()-> VerifyUser.verifyUser("melo","123")).thenReturn(true);
        mocked2.when(()-> GetPermissions.getUserPermissions("melo","123")).thenReturn("CRUD");

    }




    @Test
    public void verifyRoleA(){


        String actualResult =  getRoles.obtenerRoles("melo","123");
        String expectedResult = "PERMISSION ROLE : CRUD" + "-" + date.toString();

        Assertions.assertEquals(expectedResult,actualResult,"error");

    }

    @Test
    public void verifyRoleB(){


        String actualResult =  getRoles.obtenerRoles("melo0","123");
        String expectedResult = "Incorrect USER and PWD";

        Assertions.assertEquals(expectedResult,actualResult,"error");

    }




}
