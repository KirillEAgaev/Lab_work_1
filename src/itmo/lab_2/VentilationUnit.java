package itmo.lab_2;

public class VentilationUnit {
    private String nameUnit;
    private int widthUnit;
    private int lengthUnite;
    private String serviceSide;

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

    public static void main(String[] args) {
        VentilationUnit ventilationUnit = new VentilationUnit();

        ventilationUnit.setNameUnit("P1");
        String unitName = ventilationUnit.getNameUnit();

        System.out.println(unitName);
    }
}
