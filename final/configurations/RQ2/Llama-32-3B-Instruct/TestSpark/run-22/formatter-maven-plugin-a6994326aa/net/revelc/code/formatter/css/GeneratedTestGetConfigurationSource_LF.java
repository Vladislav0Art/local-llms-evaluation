package net.revelc.code.formatter.css;

public class GeneratedTestGetConfigurationSource_LF {

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

}