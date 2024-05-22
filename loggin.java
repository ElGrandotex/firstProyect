package firtsProyect;

import java.util.Scanner;

public class Loggin {

    static int intentosFallidos = 0;

    static String recibirDato(String forma) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte aquí su " + forma);
        String data = scan.nextLine();
        return data;
    }

    static boolean comprobarDato(String data, String checker) {
       // return data.equals(checker);
        // Modificación 01 para que la verificación siempre acepte siempre
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido usuario");
        String usuario;
        String contrasena;
        boolean ingresoExitoso = false;

        while (!ingresoExitoso || intentosFallidos < 3) {// Ajustamos aquí para que el contador no incremente correctamente (requiere quitar la modificación 01)
            usuario = recibirDato("usuario");
            contrasena = recibirDato("contraseña");

            if (comprobarDato(usuario, "User") && comprobarDato(contrasena, "contrasena")) {
                System.out.println("Ingreso de sesión exitoso");
                ingresoExitoso = true;
            } else {
                System.out.println("Credenciales incorrectas, intente de nuevo");
                
                if (intentosFallidos < 2) {
                    intentosFallidos++;
                }
            }
        }

        if (!ingresoExitoso) {
            System.out.println("Ha excedido el número máximo de intentos fallidos");
        } else {
            System.out.println("Ingresando al sistema ");
            
        }
    }
}