
package parcial;

import javax.swing.JOptionPane;

public class Preguntas {
    public static void main(String[] args) {
        Parcial Parcial = new Parcial();
        int opcion = 0;
        do{ 
           try {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. ¿Que es un commit?"
            +"\n 2. ¿Que es un push?"
            +"\n 3. ¿Que es un pull?"
            +"\n 4. ¿Que es un clase?"
            +"\n 5. ¿Que es un objeto?"
            +"\n 6. Nombre Estudiante"
            +"\n 7. Fecha"              
            +"\n 8. Salir"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
            }                     
             switch(opcion){
                case 1:
                   Parcial.commit();
                   break;
                case 2:
                   Parcial.push();
                   break;
                   case 3:                  
                   Parcial.pull();
                   break;
                case 4:                   
                   Parcial.clase();
                   break;
                case 5:                    
                   Parcial.objeto();
                   break;
                case 6:
                   Parcial.setNombre("");
                   JOptionPane.showMessageDialog(null, "Fabio arias");
                   Parcial.getNombre();                                
                   break;
                case 7:
                   Parcial.setFecha("");
                   JOptionPane.showMessageDialog(null, "10/10/19");
                   Parcial.getFecha();                   
                   break; 
                case 8:
                    Parcial sal= new Parcial();
                    sal.salir();
                   break; 
                 default:
                    Parcial def = new Parcial();
                    def.mostrarMensaje();
                    break;
            }
        } while (opcion!=8);
    }
}

        