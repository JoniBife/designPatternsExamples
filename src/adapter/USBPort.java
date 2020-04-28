package adapter;

public class USBPort {

    public static void insertUSB(USB usb) {
        System.out.println(usb.read());
    }
}
