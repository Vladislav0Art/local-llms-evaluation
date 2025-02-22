package net.revelc.code.formatter.css;

public class GeneratedTest {

    private CssFormatter cssFormatter;

    @Before
    public void setUp() throws Exception {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void testDoFormat_validCode_returnsFormattedCode() throws IOException {
        // Arrange
        String code = "body {}";
        LineEnding lineEnding = LineEnding.UNIX;

        // Act
        String formattedCode = cssFormatter.doFormat(code, lineEnding);

        // Assert
        assertEquals("body { }\n", formattedCode);
    }

    @Test
    public void testDoFormat_invalidCode_throwsIOException() {
        // Arrange
        String code = "invalid code";
        LineEnding lineEnding = LineEnding.UNIX;

        // Act and Assert
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, lineEnding));
    }

    @Test
    public void testDoFormat_nullCode_returnsNull() throws IOException {
        // Arrange
        String code = null;
        LineEnding lineEnding = LineEnding.UNIX;

        // Act
        String formattedCode = cssFormatter.doFormat(code, lineEnding);

        // Assert
        assertNull(formattedCode);
    }

}