package adapter;

public class CDToUSBAdapter implements USB {

    private CD cd;

    public CDToUSBAdapter(CD cd) {
        this.cd = cd;
    }

    @Override
    public String read() {
        return cd.read() + " in USB";
    }
}
