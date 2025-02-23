package net.revelc.code.formatter.css;

public class GeneratedTestInit_WithValidOptions {

    // Mock the Formatter interface
    private final Formatter formatterMock;

    @BeforeEach
    public void setUp() {
        // Set up the mock
        formatterMock = mock(Formatter.class);
    }

    @Test
    public void testInit_WithValidOptions() {
        // Arrange
        final var options = Map.of("indent", "4", "rgbAsHex", "true", "useSourceStringValues", "false");
        final var cfg = mock(ConfigurationSource.class);
        final var cssFormatter = new CssFormatter();

        // Act
        cssFormatter.init(options, cfg);

        // Assert
        assertEquals(4, cssFormatter.formatter.getIndent());
        assertTrue(cssFormatter.formatter.isRgbAsHex());
        assertFalse(cssFormatter.formatter.isUseSourceStringValues());
    }

}