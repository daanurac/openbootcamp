//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el teléfono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.credit = "credito";
        cliente.name = "Jose";
        cliente.age = 25;
        cliente.phoneNumber = 5551234;
        System.out.println("nombre: " + cliente.name + ", edad: " + cliente.age + ", telefono: " + cliente.phoneNumber + ", credito: " + cliente.credit);

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 30000;
        trabajador.name = "Pedro";
        trabajador.age = 35;
        trabajador.phoneNumber = 5551234;
        System.out.println("nombre: " + trabajador.name + ", edad: " + trabajador.age + ", telefono: " + trabajador.phoneNumber + ", salario: " + trabajador.salario);

    }
}
class Persona {
    int age;
    String name;
    int phoneNumber;
}

class Cliente extends Persona {
    String credit;
}

class Trabajador extends Persona {
    int salario;
}