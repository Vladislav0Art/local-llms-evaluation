package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Test
    public void testGetConfigurationSource_LF() throws Exception {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act
        String configSource = formatter.getConfigurationSource(LineEnding.LF);

        // Assert
        assertNotNull(configSource);
        assertEquals("body { background-color: #f2f2f2; }", configSource);
    }

    @Test
    public void testGetConfigurationSource_LT() throws Exception {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act
        String configSource = formatter.getConfigurationSource(LineEnding.LT);

        // Assert
        assertNotNull(configSource);
        assertEquals("body { background-color: #f2f2f2; }", configSource);
    }

    @Test
    public void testGetConfigurationSource_TS() throws Exception {
        // Arrange
        CssFormatter formatter = new CssFormatter();

        // Act
        String configSource = formatter.getConfigurationSource(LineEnding.TS);

        // Assert
        assertNotNull(configSource);
        assertEquals("body { background-color: #f2f2f2; }", configSource);
    }

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