package itmo.lab_2;

public class VentilationUnit {
    private String nameUnit;
    private int widthUnit;
    private int lengthUnite;
    private double power;
    private int airFlow;
    private String serviceSide;

    public VentilationUnit() {

    }

    public VentilationUnit(int power, int airFlow) {
        this.power = power;
        this.airFlow = airFlow;
    }

    public String getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(String nameUnit) {
        this.nameUnit = nameUnit;
    }

    public int getWidthUnit() {
        return widthUnit;
    }

    public void setWidthUnit(int widthUnit) {
        this.widthUnit = widthUnit;
    }

    public int getLengthUnite() {
        return lengthUnite;
    }

    public void setLengthUnite(int lengthUnite) {
        this.lengthUnite = lengthUnite;
    }

    public String getServiceSide() {
        return serviceSide;
    }

    public void setServiceSide(String serviceSide) {
        this.serviceSide = serviceSide;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getAirFlow() {
        return airFlow;
    }

    public void setAirFlow(int airFlow) {
        this.airFlow = airFlow;
    }
}
