package net.revelc.code.formatter.css;

public class GeneratedDoFormatNonEmptyStringWithLineEndingCRLFTest {

    @Test
    public void doFormatNonEmptyStringWithLineEndingCRLFTest() throws IOException {
        // Arrange
        String input = "test\r\n";
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