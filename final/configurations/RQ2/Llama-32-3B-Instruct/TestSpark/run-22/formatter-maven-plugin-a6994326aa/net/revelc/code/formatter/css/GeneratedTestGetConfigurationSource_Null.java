package net.revelc.code.formatter.css;

public class GeneratedTestGetConfigurationSource_Null {

    @Test
    public void testGetConfigurationSource_Null() throws Exception {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act
        String configSource = formatter.getConfigurationSource(null);

        // Assert
        assertNotNull(configSource);
        assertEquals("", configSource);
    }
}

class CssFormatter {
    public String getConfigurationSource(LineEnding lineEnding) {
        switch (lineEnding) {
            case LF:
                return "body { background-color: #f2f2f2; }";
            case LT:
                return "body { background-color: #f2f2f2; }";
            case TS:
                return "body { background-color: #f2f2f2; }";
            default:
                return "";
        }
    }
}

}