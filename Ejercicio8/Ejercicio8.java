package Ejercicio8;

/**
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList 
 * para almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

public class Ejercicio8 {
    public static void main(String[] args) {
    
        Baraja b = new Baraja();
        for (int i = 0; i < 9; i++) {
          System.out.println(b.pop());
        }
        
      }
    }
    