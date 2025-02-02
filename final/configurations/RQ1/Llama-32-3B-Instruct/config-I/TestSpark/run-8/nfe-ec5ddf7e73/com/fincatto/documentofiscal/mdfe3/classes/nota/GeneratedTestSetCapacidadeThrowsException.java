package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeThrowsException {

    public InvalidValueException(String message) {
        super(message);
    }
}

public class TestNotas {

    @Test
    public void testSetCapacidadeThrowsException() throws InvalidValueException {
        // Arrange
        String value = "not a number";

        // Act and Assert
        assertThrows(InvalidValueException.class, () -> SetCapacidadeM3.setCapacidadeM3("m3", value));
    }
}

public class SetCapacidadeM3 {

    public static String setCapacidadeM3(String capacity, String value) throws InvalidValueException {
        if (!value.matches("\\d+")) {
            throw new InvalidValueException("Invalid value");
        }
        return "capacidade";
    }

}