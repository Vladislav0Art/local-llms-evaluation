package net.revelc.code.formatter.css;

public class GeneratedIsInitializedSuccessTest {

    @Test
    public void isInitializedSuccessTest() {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act and Assert
        assertTrue(formatter.isInitialized());
    }

}