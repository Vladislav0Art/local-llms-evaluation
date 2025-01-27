package net.revelc.code.formatter.css;

public class GeneratedDoFormatNonEmptyStringTest {

    @Test
    public void doFormatNonEmptyStringTest() throws IOException {
        // Arrange
        String input = "test";
        CssFormatter formatter = new CssFormatter();

        // Act
        try {
            Object result = formatter.doFormatNonEmptyString(input);
            assert false;
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

}