package net.revelc.code.formatter.css;

public class GeneratedTestIsInitialized {

    @Test
    public void testIsInitialized() {
        // Arrange
        Map<String, String> options = new HashMap<>();
        options.put("format", "css");
        final ConfigurationSource cfg = new ConfigurationSource();

        // Act
        final CssFormatter formatter = new CssFormatter(options, cfg);
        final boolean isInitialized = formatter.isInitialized();

        // Assert
        assertTrue(isInitialized);
    }

}