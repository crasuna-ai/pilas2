import java.util.Stack;
import javax.swing.JOptionPane;

public class metodos {
    public void Llenarpila(){
        Stack<Bicicleta> pila = new Stack<>();
        boolean continuar = true;
        String agregar ="";
        while (continuar){
            Bicicleta b = new Bicicleta();
            b.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad")));
            b.setMarca(JOptionPane.showInputDialog("ingrese marca"));
            b.setReferencia(JOptionPane.showInputDialog("ingrese referencia"));
            b.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("ingresa cantidad")));
            pila.push(b);
            agregar = JOptionPane.showInputDialog("desea buscar otro repuesto Si/No");
            if (agregar.equalsIgnoreCase("No")) {
                
            }
            continuar = false;
        }
    } 
    
    MostrarPila(pila);
    int opt = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1: ingresar repuesto, 2: buscar repuesto, 3: modificar repuesto, 4: eliminar repuesto 5: vender repuesto"));
    pila = AccionesdeRegistro(pila , opt);
    MostrarPila(pila);   
}
public void MostrarPila(Stack<Bicicleta>pila){
    for (Bicicleta b : pila){
        System.out.println("Marca"+ b.getMarca());
        System.out.println("Referencia" + b.getReferencia());
        System.out.println("Cantidad" + b.getCantidad());
        System.out.println("precio" + b.getPrecio());
        System.out.println();        
    }
}

public Stack<Bicicleta> AccionesdeRegistro(Stack<Bicicleta> pila , int opt){
String dato = "";
if (opt == 1) {
    dato = JOptionPane.showInputDialog("Ingrese el repuesto que desea registrar");
} else if (opt == 2) {
    dato = JOptionPane.showInputDialog("Ingrese el repuesto que desea bucar");
} else if (opt == 3) {
    dato = JOptionPane.showInputDialog("ingrese el repuesto que desea modificar");
    }
    else if (opt == 4){
        dato = JOptionPane.showInputDialog("ingrese el repuesto a eliminar");
    }
    else if (opt == 5) {
        dato = JOptionPane.showInputDialog("ingrese el repuesto que desea vender");
    }
}
for (Bicicleta bicicleta : pila){
    if (bicicleta.getMarca().equalsIgnoreCase(dato)){
        if (opt ==1){
            System.out.println("repuesto ingresado");
        }
        else if _(opt == 2){
            System.out.println(" el registro se encuentra y es" + bicicleta.getMarca()+" "+ bicicleta.getReferencia()+" "+ bicicleta.getCantidad()+" " + bicicleta.getPrecio());

        }
        else if (opt == 3){
            System.out.println("modificar repuesto" + bicicleta.setMarca(JOptionPane.showInputDialog("ingrese la marca")));
            


        }
    }
}

