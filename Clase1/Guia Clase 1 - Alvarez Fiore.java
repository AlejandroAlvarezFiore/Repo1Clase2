import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int numInicio = 5;
        int numFin = 14;
        
        //a)
        while (numInicio<=numFin) {
            System.out.println(numInicio);
            numInicio++;
        }
        
        //b)
        numInicio = 5;
        
        while (numInicio<=numFin) {
            if (numInicio%2==0) {
                System.out.println(numInicio);
            }
            numInicio++;
        }
        
        //c
        numInicio = 5;
        boolean mostrarPares = true;
        
        while (numInicio<=numFin) {
            if ((numInicio%2==0 && mostrarPares) || (numInicio%2!=0 && !mostrarPares)) {
                System.out.println(numInicio);
            }
            numInicio++;
        }
        
        //d
        numInicio = 5;
        
        for (int i=numFin; i>=numInicio; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}

//2


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        float ingresos = 300000; //ingresos mensuales
        int vehiculosViejos = 0; //vehiculos con una antiguedad menor a 5 años
        int inmuebles = 0; // inmuebles
        boolean otrosLujos = false; //poseer embarcacion, aeronave de lujo o ser titular de activos societarios
        
        if (ingresos<489083 && vehiculosViejos<3 && inmuebles<3 && !otrosLujos) {
            System.out.println("No pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Pertenece al segmento de ingresos altos");
        }
    }
}
