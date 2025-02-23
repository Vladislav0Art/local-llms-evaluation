package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_WithValidContent {

    // Mock the Formatter interface
    private final Formatter formatterMock;

    @BeforeEach
    public void setUp() {
        // Set up the mock
        formatterMock = mock(Formatter.class);
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

}