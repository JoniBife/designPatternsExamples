package factoryMethod;

public class ComplexType {

    public static ComplexType create() {
        return new ComplexType(
                1,
                2
        );
    }

    public ComplexType(
            int param1,
            int param2
    ) { /*Bind parameters to fields*/}
}
