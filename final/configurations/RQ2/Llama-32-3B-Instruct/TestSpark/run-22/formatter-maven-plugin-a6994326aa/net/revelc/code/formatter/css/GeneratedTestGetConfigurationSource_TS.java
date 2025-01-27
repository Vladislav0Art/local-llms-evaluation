package net.revelc.code.formatter.css;

public class GeneratedTestGetConfigurationSource_TS {

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

}