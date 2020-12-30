package LOGICA;

public class Auto extends Vehiculo{
    
    String cantPuertas;

    public Auto() {
    }

    public Auto(String cantPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public String getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(String cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    @Override
    public String getCaracteristica(){
        return cantPuertas;
    }
    
    
    
    
}
