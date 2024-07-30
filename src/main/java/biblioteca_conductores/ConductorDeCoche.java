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
