
package parcial;
import javax.swing.JOptionPane;

public class Parcial {
private int id;
private String fecha;
private String  nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        JOptionPane.showMessageDialog(null, "8216");
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
   public void commit(){
   JOptionPane.showMessageDialog(null,"se refiere, en el contexto de la ciencia de la computación y la gestión de datos, a la idea de confirmar un conjunto de cambios provisionales de forma permanente. Un uso popular es al final de una transacción de base de datos." );
   }
   public void push(){
   JOptionPane.showMessageDialog(null, "es un comando que sube los cambios hechos en tu ambiente de trabajo a una rama de trabajo tuya y/o de tu equipo remota.");
   }
   public void pull(){
   JOptionPane.showMessageDialog(null, "Para actualizar tu repositorio local al commit más nuevo");
   }
   public void clase(){
   JOptionPane.showMessageDialog(null, "son plantillas para la creación de objetos, en lo que se conoce como programación orientada a objetos");
   }
   public void objeto(){
   JOptionPane.showMessageDialog(null, "Es la instanciacion de la clase");
   }
public void salir() {
     System.exit(0);
    }
public void mostrarMensaje() {
        JOptionPane.showMessageDialog (null,"Ingrese nuevamente la opcion");
        JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
                }
    }
                   
                   
                   
           
   
    
    

