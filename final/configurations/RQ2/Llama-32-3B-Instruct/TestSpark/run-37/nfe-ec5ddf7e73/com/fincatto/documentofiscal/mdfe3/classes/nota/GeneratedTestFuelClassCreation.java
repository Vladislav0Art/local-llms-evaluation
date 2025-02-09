package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestFuelClassCreation {

    private String fuelType;
    private int quantity;

    public Fuel(String fuelType, int quantity) {
        this.fuelType = fuelType;
        this.quantity = quantity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class FuelTest {

    @Test
    public void testFuelClassCreation() {
        Fuel fuel = new Fuel("Gasoline", 100);
        Assert.assertEquals(fuel.getFuelType(), "Gasoline");
        Assert.assertEquals(fuel.getQuantity(), 100);
    }

}