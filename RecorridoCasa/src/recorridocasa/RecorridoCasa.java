/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridocasa;
import java.util.Scanner;

/**
 *
 * @author Usuario17
 */
public class RecorridoCasa {

    static int o, cpu;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
        System.out.println("\nSelecciona una opción");
        System.out.println("1. Jugar Piedra, Papel o Tijera \n2. Recorrido Casa \n3. Salir");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        switch(o){
            case 1:
                piedraPapelTijera();
                break;
            case 2:
                Afuera();
                break;
            case 3:
                System.out.println("Adios :)\n");
                break;
        }
        }while(o!= 3);
    }
    
    public static void piedraPapelTijera(){
        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        do{
         cpu = (int)Math.ceil(Math.random()*3);
         System.out.println("Selecciona una opción");
         System.out.println("1. Piedra \n2. Papel \n3. Tijera \n4. Salir");
         Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        switch(o){
            case 1:
                System.out.println("Elejiste Piedra");
                if(o == cpu){
                    System.out.println("El CPU eligió Piedra\n Es un empate\n");
                }
                if(cpu == 3){
                    System.out.println("El CPU eligió Tijera\n Ganaste!!!!\n");
                }
                if(cpu == 2){
                    System.out.println("El CPU eligió Papel\n Perdedor jajajaja\n");
                }
                break;
            case 2:
                System.out.println("Elejiste Papel");
                if(o == cpu){
                    System.out.println("El CPU eligió Papel\n Es un empate\n");
                }
                if(cpu == 1){
                    System.out.println("El CPU eligió Piedra\n Ganaste!!!!\n");
                }
                if(cpu == 3){
                    System.out.println("El CPU eligió Tijera\n Perdedor jajajaja\n");
                }
                break;
            case 3:
                System.out.println("Elejiste Tijera");
                if(o == cpu){
                    System.out.println("El CPU eligió Tijera\n Es un empate\n");
                }
                if(cpu == 2){
                    System.out.println("El CPU eligió Papel\n Ganaste!!!!\n");
                }
                if(cpu == 1){
                    System.out.println("El CPU eligió Piedra\n Perdedor jajajaja\n");
                }
                break;
            case 4:
                System.out.println("Menú");
                break;
        }
        }while(o != 4);
    }
    
    public static void Afuera(){
        do{
        System.out.println("Estás afuera.");
        System.out.println("¿Quieres entrar?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        switch(o){
            case 1:
                Adentro();
                break;
            case 2:
                System.out.println("Menú\n");
                break;
        }
        }while(o != 2);
    }
    
    public static void Adentro(){
        do{
        System.out.println("Estás adentro");
        System.out.println("Selecciona una opción");
        System.out.println("1. Subir Escaleras \n2. Ir al Comedor \n3. Ir Afuera");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        switch(o){
            case 1:
                Arriba();
                break;
            case 2:
                Comedor();
                break;
            case 3:
                Afuera();
                break;
            default:
                System.out.println("Selecciona una opción valida\n");
        }
        }while(!(o == 1 || o == 2 || o == 3));
    }
    
    public static void Arriba(){
        do{
        System.out.println("Estás arriba aquí se encuentra mi habitación, un baño y la habitación de huespedes\n");
        System.out.println("¿Quieres bajar?\n");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Adentro();
            break;
        }
        
        }while(o!=1);
    }
    
    public static void Comedor(){
        do{
        System.out.println("Estás en el Comedor");
        System.out.println("Selecciona una opción");
        System.out.println("1. Ir a la Cocina \n2. Ir a la Sala \n3. Regresar a la puerta");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        switch(o){
            case 1:
                Cocina();
                break;
            case 2:
                Sala();
                break;
            case 3:
                Adentro();
                break;
            default:
                System.out.println("Selecciona una opción valida\n");
        }
        }while(!(o == 1 || o == 2 || o == 3));
    }
    
    public static void Cocina(){
        do{
        System.out.println("Estás en la cocina, aqui me preparo mi desayuno y mi cena todos los días\n");
        System.out.println("¿Quieres regresar al comedor?\n");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Comedor();
            break;
        }
        
        }while(o!=1);
    }
    
    public static void Sala(){
        do{
        System.out.println("Estás en sala, aqui hay una televisión, pero nunca tengo tiempo de verla\n");
        System.out.println("¿Quieres regresar al comedor?\n");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Comedor();
            break;
        }
        
        }while(o!=1);
    }
}
