package net.revelc.code.formatter.css;

public class GeneratedIsInitializedFailureTest {

    @Test
    public void isInitializedFailureTest() {
        // Arrange
        CssFormatter formatter = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> formatter.isInitialized());
    }

}