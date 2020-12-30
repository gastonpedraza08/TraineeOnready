package LOGICA;

public class Moto extends Vehiculo{
    
    String cilindrada;

    public Moto() {
    }

    public Moto(String cilindrada, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String getCaracteristica(){
        return cilindrada;
    }
    
    
}
