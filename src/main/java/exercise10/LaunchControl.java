package exercise10;

public class LaunchControl {
    public static void main(String[] args) {
        Vehiculo vh1 = new Vehiculo("758ZFD","Camioneta","Toyots");
        Vehiculo vh2 = new Vehiculo("256GJK","Sedan","Nissan");
        Vehiculo vh3 = new Vehiculo("9017TTA","Full Version","Changan");
        Vehiculo vh4 = new Vehiculo("5609OHI","Medium Version","Subaru");
        Vehiculo vh5 = new Vehiculo("9265ADGU","Vagoneta","Ford");
        Vehiculo vh6 = new Vehiculo("1753DNX","Deportivo","Chevrolet");

        System.out.println("$$$$$$$$$$$$$$$$$$$");
        vh1.registro();
        vh1.pagar();
        vh2.registro();
        vh2.pagar();
        vh3.registro();
        vh3.pagar();
        vh4.registro();
        vh4.pagar();
        vh5.registro();
        vh5.pagar();
        vh6.registro();
        vh6.pagar();
        System.out.println("$$$$$$$$$$$$$$$$$$$");
    }
}
