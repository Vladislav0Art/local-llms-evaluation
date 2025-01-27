package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyStringTest {

    @Test
    public void doFormatEmptyStringTest() throws IOException {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act
        try {
            formatter.doFormatEmptyString();
            assert false;
        } catch (UnsupportedOperationException e) {
            // Expected exception
        }
    }

}