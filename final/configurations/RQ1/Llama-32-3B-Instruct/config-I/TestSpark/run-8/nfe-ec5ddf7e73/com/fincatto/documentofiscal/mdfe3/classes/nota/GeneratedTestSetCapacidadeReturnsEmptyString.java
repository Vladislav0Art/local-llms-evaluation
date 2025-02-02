package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeReturnsEmptyString {

    public InvalidValueException(String message) {
        super(message);
    }
}

public class TestNotas {

    @Test
    public void testSetCapacidadeReturnsEmptyString() {
        // Arrange
        String result = "empty";

        // Act
        String actualResult = SetCapacidadeM3.setCapacidadeM3("m3", result);

        // Assert
        assertEquals(result, actualResult);
    }

}