package MyPkg;

public class InheritanceMethodOverriding {

    
    static class Vehicle {
        void fuelType() {
            System.out.println("Runs on fuel");
        }
    }

   
    static class ElectricCar extends Vehicle {
        @Override
        void fuelType() {
            System.out.println("Runs on electricity");
        }
    }

    public static void main(String[] args) {
    	
        Vehicle myVehicle = new Vehicle();
        ElectricCar myTesla = new ElectricCar();
        myVehicle.fuelType();
        myTesla.fuelType();
    }
}