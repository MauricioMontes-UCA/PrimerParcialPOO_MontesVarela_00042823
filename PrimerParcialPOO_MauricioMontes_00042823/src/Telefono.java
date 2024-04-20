public class Telefono extends Dispositivo implements Articulo {
    private int megapixeles;
    private float pulgadas;

    public Telefono () {};

    public Telefono (String nombre, String modelo, String descripcion, double precio, int megapixeles, float pulgadas){
        super(nombre, modelo, descripcion, precio);
        this.megapixeles = megapixeles;
        this.pulgadas = pulgadas;

    }


    @Override
    public String getDescripcion() {
        return super.getDescripcion(); //some nice specs, IDK
    }

    public int getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(int megapixeles) {
        this.megapixeles = megapixeles;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    static public void mostrarInformacion(Telefono instancia) {
        System.out.println(
                "\nNombre: "+ instancia.getNombre() +
                "\nArtículo: Teléfono móvil" +
                "\nModelo: "+ instancia.getModelo() +
                "\nMegapixeles cámara: "+ instancia.megapixeles +
                "\nPulgadas pantalla: " + instancia.pulgadas +
                "\nDescripción: "+ instancia.getDescripcion() +
                "\nPrecio: "+ instancia.getPrecio()
        );
    }
}
