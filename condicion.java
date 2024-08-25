import java.util.Scanner;

class Condicion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String name;
        int mesa = 8; 
        int mesu; 
        int anoa = 2024; 
        int anou; 
        int diaa = 23; 
        int diau;
        int edad1;  
        int edad2;

        System.out.println("Escriba su nombre:");
        name = leer.next(); // Cambiado a next() para leer un String

        System.out.println(name + ", ingrese su año de nacimiento:");
        anou = leer.nextInt();
        System.out.println(name + ", ingrese el numero de su mes de nacimiento (1-12):");
        mesu = leer.nextInt();
        System.out.println(name + ", ingrese su dia de nacimiento:");
        diau = leer.nextInt();

        // Calcular edad
        if (mesu < mesa || (mesu == mesa && diau <= diaa)) {
            edad1 = anoa - anou;
            System.out.println(name + ", su edad es: " + edad1);
        } else {
            edad2 = anoa - anou - 1; 
            System.out.println(name + ", su edad es: " + edad2);
        }

        String signo = "";

        if (mesu == 1) {
            signo = (diau <= 20) ? "Capricornio" : "Acuario";
        } else if (mesu == 2) {
            signo = (diau <= 19) ? "Acuario" : "Piscis";
        } else if (mesu == 3) {
            signo = (diau <= 20) ? "Piscis" : "Aries";
        } else if (mesu == 4) {
            signo = (diau <= 20) ? "Aries" : "Tauro";
        } else if (mesu == 5) {
            signo = (diau <= 21) ? "Tauro" : "Géminis";
        } else if (mesu == 6) {
            signo = (diau <= 21) ? "Géminis" : "Cáncer";
        } else if (mesu == 7) {
            signo = (diau <= 22) ? "Cáncer" : "Leo";
        } else if (mesu == 8) {
            signo = (diau <= 23) ? "Leo" : "Virgo";
        } else if (mesu == 9) {
            signo = (diau <= 23) ? "Virgo" : "Libra";
        } else if (mesu == 10) {
            signo = (diau <= 23) ? "Libra" : "Escorpio";
        } else if (mesu == 11) {
            signo = (diau <= 22) ? "Escorpio" : "Sagitario";
        } else if (mesu == 12) {
            signo = (diau <= 21) ? "Sagitario" : "Capricornio";
        }

        System.out.println(name + ", tu signo zodiacal es: " + signo);
    }
}
