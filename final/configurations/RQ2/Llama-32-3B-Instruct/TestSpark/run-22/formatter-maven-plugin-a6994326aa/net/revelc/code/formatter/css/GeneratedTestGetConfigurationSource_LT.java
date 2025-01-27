package net.revelc.code.formatter.css;

public class GeneratedTestGetConfigurationSource_LT {

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

}