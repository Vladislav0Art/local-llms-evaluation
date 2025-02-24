package net.revelc.code.formatter.css;

public class GeneratedInitTest {

    private CssFormatter cssFormatter;

    @Test
    public void initTest() {
        // Given
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();

        // When
        cssFormatter.init(options, cfg);

        // Then
        assertTrue(cssFormatter.isInitialized());
    }

}