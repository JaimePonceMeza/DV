package calculodv;

import java.util.Scanner;

public class CalculoDV {

    public static void main(String[] args) {
        Rut Vector[] = new Rut[9];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < Vector.length; i++) {
            Rut digito = new Rut();
            System.out.println("Ingrese el digito de su rut (incluya dígito verificador): ");
            digito.setNumcedula(lector.nextInt());
            Vector[i] = digito;
        }
        System.out.println("Su RUT es:" + Vector[0].getNumcedula() + Vector[1].getNumcedula() + "." + Vector[2].getNumcedula() + Vector[3].getNumcedula() + Vector[4].getNumcedula() + "." + Vector[5].getNumcedula() + Vector[6].getNumcedula() + Vector[7].getNumcedula() + "-" + Vector[8].getNumcedula());
        long resultado = Vector[7].getNumcedula() * 2 + Vector[6].getNumcedula() * 3 + Vector[5].getNumcedula() * 4 + Vector[4].getNumcedula() * 5 + Vector[3].getNumcedula() * 6 + Vector[2].getNumcedula() * 7 + Vector[1].getNumcedula() * 2 + Vector[0].getNumcedula() * 3;
        System.out.println("Sumea es:" + Vector[8].getNumcedula() * 2 +" "+ Vector[7].getNumcedula() * 3+" " + Vector[6].getNumcedula() * 4 +" "+ Vector[5].getNumcedula() * 5 +" "+ Vector[4].getNumcedula() * 6 +" "+ Vector[3].getNumcedula() * 7 +" "+ Vector[2].getNumcedula() * 2+" "+ Vector[1].getNumcedula() * 3 +" "+Vector[0].getNumcedula() * 4);
        System.out.println("Resultado es:"+ resultado);
        long resto = resultado%11;
        System.out.println("Resto es:"+ resto);
        System.out.println("Su dígito verificador es:"+ (11 - resto));
        
// TODO code application logic here

    }

}
