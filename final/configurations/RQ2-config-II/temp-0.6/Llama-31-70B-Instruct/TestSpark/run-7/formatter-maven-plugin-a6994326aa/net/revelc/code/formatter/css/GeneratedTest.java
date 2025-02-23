package net.revelc.code.formatter.css;

public class GeneratedTest {

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

    @Test
    public void testDoFormat_WithValidContent() throws IOException {
        // Arrange
        final var cssFormatter = new CssFormatter();
        final var code = "body { color: #fff; }";
        final var ending = LineEnding.UNIX;

        // Act
        final var formattedCode = cssFormatter.doFormat(code, ending);

        // Assert
        assertNotEquals(code, formattedCode);
    }

    @Test
    public void testIsInitialized_WithValidFormatter() {
        // Arrange
        final var cssFormatter = new CssFormatter();

        // Act
        final var initialized = cssFormatter.isInitialized();

        // Assert
        assertTrue(initialized);
    }

}