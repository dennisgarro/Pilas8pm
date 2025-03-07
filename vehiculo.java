public class vehiculo {
    private String Marca;
    private String Color;
    private int Precio;

    public vehiculo(String marca, String color, int precio) {
        Marca = marca;
        Color = color;
        Precio = precio;
    }

    public vehiculo() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

}