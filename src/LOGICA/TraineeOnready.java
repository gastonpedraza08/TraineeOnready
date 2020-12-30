package LOGICA;

import java.util.ArrayList;
import java.util.List;

public class TraineeOnready {
    public static void main(String[] args) {
      
        Auto auto1 = new Auto("4", "Peugeot", "206", 200000);
        Moto moto1 = new Moto("125cc", "Honda", "Titan", 60000);
        Auto auto2 = new Auto("5", "Peugeot", "208", 250000);
        Moto moto2 = new Moto("160cc", "Yamaha", "YBR", 80500.50 );

        int contieneY = -1;
        
        List<Vehiculo> listaVehiculos = new ArrayList();
        listaVehiculos.add(auto1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(auto2);
        listaVehiculos.add(moto2);
        
        //BUSCANDO EL QUE CONTIENE Y
        for (int i=0; i<listaVehiculos.size(); i++){  
            if(listaVehiculos.get(i).getModelo().contains("Y")){
                contieneY= i;
            }
        }
     
        //ORDENANDO POR PRECIO
        List<Vehiculo> listaVehiculosAux = new ArrayList();
        for(Vehiculo vehi : listaVehiculos){
            listaVehiculosAux.add(vehi);
        }
        List<Vehiculo> listaOrdenada = new ArrayList();
        
        while(!listaVehiculosAux.isEmpty()){
            double precioAlto = 0;
            int index = 0;
           
            for(int i = 0; i<listaVehiculosAux.size();i++){
               if(precioAlto < listaVehiculosAux.get(i).getPrecio()){
                precioAlto = listaVehiculosAux.get(i).getPrecio();
                index = i;
                }
            }
            listaOrdenada.add(listaVehiculosAux.get(index));
            listaVehiculosAux.remove(index); 
        } //cierre del while
        
       
        //IMPRIMIENDO RESULTADOS
        String caracteristica = "";
        for(Vehiculo v : listaVehiculos){
            if(v.toString().contains("Auto")){
                caracteristica = "Puertas: ";
            }else if(v.toString().contains("Moto")){
                caracteristica = "Cilindrada: ";
            }
            System.out.println("Marca: "+v.getMarca()+" // Modelo: "+v.getModelo()+" // "+ caracteristica +v.getCaracteristica()+" // Precio: "+ v.getPrecio());
        }
  
        System.out.println("----------------------------------------------");
        System.out.println("Vehiculo más caro: " + listaOrdenada.get(0).getMarca()+" "+listaOrdenada.get(0).getModelo());
        System.out.println("Vehiculo más barato: " + listaOrdenada.get(listaOrdenada.size()-1).getMarca()+" "+listaOrdenada.get(listaOrdenada.size()-1).getModelo());
        if(contieneY != -1){
            System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ listaVehiculos.get(contieneY).getMarca()+" "+listaVehiculos.get(contieneY).getModelo()+" $"+listaVehiculos.get(contieneY).getPrecio());
        }else{
            System.out.println("Ningun vehiculo contiene la letra Y");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
            for(Vehiculo vehic : listaOrdenada){
                System.out.println(vehic.getMarca()+" "+vehic.getModelo());
        }
        
        
        
    }
    
}
