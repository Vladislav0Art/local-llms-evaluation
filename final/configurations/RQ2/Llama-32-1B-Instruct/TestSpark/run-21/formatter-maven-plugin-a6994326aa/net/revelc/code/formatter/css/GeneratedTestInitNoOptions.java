package net.revelc.code.formatter.css;

public class GeneratedTestInitNoOptions {

    @Test
    public void testInitNoOptions() throws IOException {
        // Arrange
        final Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;

        // Act
        CssFormatter formatter = new CssFormatter(options);

        // Assert
        assert Not(formatter.isInitialized());
    }

}