package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeReturnsException {

    public InvalidValueException(String message) {
        super(message);
    }
}

public class TestNotas {

    @Test
    public void testSetCapacidadeReturnsException() throws InvalidValueException {
        // Arrange
        String exceptionMessage = "invalid value";

        // Act and Assert
        try {
            SetCapacidadeM3.setCapacidadeM3("m3", exceptionMessage);
            assert false;
        } catch (InvalidValueException e) {
            assertEquals(exceptionMessage, e.getMessage());
        }
    }

}