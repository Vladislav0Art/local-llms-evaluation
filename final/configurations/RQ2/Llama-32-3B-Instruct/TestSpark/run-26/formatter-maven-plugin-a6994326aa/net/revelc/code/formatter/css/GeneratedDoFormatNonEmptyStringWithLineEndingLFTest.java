package net.revelc.code.formatter.css;

public class GeneratedDoFormatNonEmptyStringWithLineEndingLFTest {

    @Test
    public void doFormatNonEmptyStringWithLineEndingLFTest() throws IOException {
        // Arrange
        String input = "test\n";
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