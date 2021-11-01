import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //VARIABLES DE DATOS ALMACENADOS
        String  nombre, apellido, edad, hobbie, editor, so;
               
        //DECLARO OBJETO PARA PEDIDO DE DATOS
        Scanner datos=new Scanner(System.in);
        
        //PEDIDO DE DATOS
        System.out.println("Digite su nombre:");
        nombre = datos.nextLine();
        
        System.out.println("Digite su apellido:");
        apellido = datos.nextLine();
        
        System.out.println("Digite su edad:");
        edad = datos.nextLine();
        
        System.out.println("Digite su hobbie:");
        hobbie = datos.nextLine();
        
        System.out.println("Digite su editor favorito:");
        editor = datos.nextLine();
        
        System.out.println("Digite su sistema operativo:");
        so = datos.nextLine();
        
        
        //IMPRESION DE DATOS ALMACENADOS
        System.out.println("--------------------------------------");
        System.out.println("INFORMACION ALMACENADA EN FORMULARIO  ");
        System.out.println("--------------------------------------");
        System.out.println("Nombre:            " + nombre);
        System.out.println("Apellido:          " + apellido);
        System.out.println("Edad:              " + edad);
        System.out.println("Hobbie:            " + hobbie);
        System.out.println("Editor favorito:   " + editor);
        System.out.println("Sistema Operativo: " + so);
             
        datos.close();

    }
}
