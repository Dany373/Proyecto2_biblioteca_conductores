# Biblioteca Conductores

## Clases de conductores 

### Clase Conductor.java 
```java
package biblioteca_conductores;

public class Conductor {

    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
    }
}

Clase ConductorDeCoche.java
package biblioteca_conductores;

public class ConductorDeCoche extends Conductor{
    private int experienciaAnios;

    public ConductorDeCoche(String nombre, String licencia, int experienciaAnios) {
        super(nombre, licencia);
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Años de experiencia: " + experienciaAnios);
    }
}


Clase ConductorDeMoto.java

package biblioteca_conductores;

public class ConductorDeMoto extends Conductor{
    private boolean tieneLicenciaMoto;

    public ConductorDeMoto(String nombre, String licencia, boolean tieneLicenciaMoto) {
        super(nombre, licencia);
        this.tieneLicenciaMoto = tieneLicenciaMoto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene licencia de moto: " + (tieneLicenciaMoto ? "Sí" : "No"));
    }
}
