package staticInnerClass;

public class Test {
    public static void main(String[] args) {
        ElectroCar example = new ElectroCar(1);
        example.start();
        ElectroCar.Battery battery = new ElectroCar.Battery();
        battery.charge();
    }
}
