package net.revelc.code.formatter.css;

public class GeneratedTestInitDefaultOptions {

    @Test
    public void testInitDefaultOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Is(formatter.isInitialized());
    }

}