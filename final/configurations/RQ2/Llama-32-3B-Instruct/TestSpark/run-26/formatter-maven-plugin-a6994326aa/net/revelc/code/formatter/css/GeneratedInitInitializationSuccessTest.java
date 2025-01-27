package net.revelc.code.formatter.css;

public class GeneratedInitInitializationSuccessTest {

    @Test
    public void initInitializationSuccessTest() {
        // Arrange
        Map<String, String> options = Collections.emptyMap();
        ConfigurationSource cfg = new ConfigurationSource();

        // Act
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);

        // Assert
        assertTrue(formatter.isInitialized());
    }

}