public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .setCPU("i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();

        c.show();
    }
}