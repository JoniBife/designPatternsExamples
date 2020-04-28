package adapter;

public class AdapterExample {

    public static void main(String[] args) {
        GameCD gameCD = new GameCD();

        CDToUSBAdapter gameUSB = new CDToUSBAdapter(gameCD);

        USBPort.insertUSB(gameUSB);
    }
}
