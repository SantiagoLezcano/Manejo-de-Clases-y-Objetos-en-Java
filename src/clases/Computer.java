package clases;

public class Computer {
    /**
     * Representa un computador  con sus caracteristicas
     * @Author: SANTIAGO
     */
    public float inches; //pulgadas
    public String brand; //marca del computador
    private String serial;
    public String processor;
    public String ramType;// DDR
    public short ramSize; // tamaño de la ram
    public boolean keypad;// teclado numerico

    public Computer(float inches, String brand, String serial, String processor, String ramType, short ramSize, boolean keypad) {
        this.inches = inches;
        this.brand = brand;
        this.serial = serial;
        this.processor = processor;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.keypad = keypad;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "inches=" + inches +
                ", brand='" + brand + '\'' +
                ", serial='" + serial + '\'' +
                ", processor='" + processor + '\'' +
                ", ramType='" + ramType + '\'' +
                ", ramSize=" + ramSize +
                ", keypad=" + keypad +
                '}';
    }
}
