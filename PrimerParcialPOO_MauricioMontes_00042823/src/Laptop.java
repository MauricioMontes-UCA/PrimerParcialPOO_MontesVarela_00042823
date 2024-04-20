public class Laptop extends Dispositivo implements Articulo {
    private int RAM;
    private String procesador;

    public Laptop () {};

    public Laptop (String nombre, String modelo, String descripcion, double precio, int RAM, String procesador){
        super(nombre, modelo, descripcion, precio);
        this.RAM =  RAM;
        this.procesador = procesador;
    }

    static public void mostrarInformacion(Laptop instancia) {
        System.out.println(
                "\nNombre: "+ instancia.getNombre() +
                "\nArtículo: Teléfono móvil" +
                "\nModelo: "+ instancia.getModelo() +
                "\nGB de RAM: "+ ((Laptop) instancia).RAM +
                "\nProcesador: " + ((Laptop) instancia).procesador +
                "\nDescripción: "+ instancia.getDescripcion() +
                "\nPrecio: "+ instancia.getPrecio()
        );
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion();
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
