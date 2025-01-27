package net.revelc.code.formatter.css;

public class GeneratedInitInitializationFailureTest {

    @Test
    public void initInitializationFailureTest() {
        // Arrange
        Map<String, String> options = Collections.emptyMap();
        ConfigurationSource cfg = null;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> new CssFormatter().init(options, cfg));
    }

}