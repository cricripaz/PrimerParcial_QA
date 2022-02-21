package ej1;

public class Salario {


    String msg = "";



    public String checkSalario(int sueldo) throws  Exception{

        int minimo = 2000;

        if (sueldo < 0){
            throw new Exception("Salario No Es Valido");

        }else{

            if (sueldo < minimo || sueldo == 2000){
                msg = "Salario: " + sueldo;
            }
            if (sueldo > minimo){
                msg = "Salario: " + (int)(sueldo - (sueldo*0.05) );
            }
            if (sueldo > minimo*2 ){
                msg = "Salario: " + (int)(sueldo - (sueldo*0.15) );
            }

        }

        return msg;


    }
}
