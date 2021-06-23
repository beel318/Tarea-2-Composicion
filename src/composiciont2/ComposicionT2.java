package composiciont2;

import ico.fes.componentes.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

public class ComposicionT2 {

    public static void main(String[] args) {
      Computadora compu1 = new Computadora("DELL", "7080 SFF", new Monitor("HP", "L1710", 23), new Mouse("ELE-GATE", "M150", "inalambrico"), new Teclado("ELE-GATE", "K220", 105, 0), new Cpu("Intel Core", "i7-10700", 3));
      
        System.out.println(compu1);
    }
    
}
