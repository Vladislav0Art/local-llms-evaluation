package net.revelc.code.formatter.css;

public class GeneratedTestInitEmptyOptions {

    @Test
    public void testInitEmptyOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Not(formatter.isInitialized());
    }

}