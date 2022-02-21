package ej1_test;

import ej1.Salario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ej1Test {



    Salario salario = new Salario();

    @Test
    public void testA() throws Exception {
        String actualResult = salario.checkSalario(2000);
        String expectedResult = "Salario: 2000";
        Assertions.assertEquals(expectedResult,actualResult,"Error");
    }

    @Test
    public void testB() throws Exception {
        String actualResult = salario.checkSalario(-2000);
        String expectedResult = "Salario: 2000";
        Assertions.assertEquals(expectedResult,actualResult,"Error");
    }


    @Test
    public void testC() throws Exception {
        String actualResult = salario.checkSalario(2100);
        String expectedResult = "Salario: 1995";
        Assertions.assertEquals(expectedResult,actualResult,"Error");
    }

    @Test
    public void testD() throws Exception {
        String actualResult = salario.checkSalario(4100);
        String expectedResult = "Salario: 3485";
        Assertions.assertEquals(expectedResult,actualResult,"Error");
    }





}
