package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestFuelSetters {

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
    public void testFuelSetters() {
        Fuel fuel = new Fuel("Gasoline", 100);
        fuel.setFuelType("Diesel");
        fuel.setQuantity(50);
        Assert.assertEquals(fuel.getFuelType(), "Diesel");
        Assert.assertEquals(fuel.getQuantity(), 50);
    }

}