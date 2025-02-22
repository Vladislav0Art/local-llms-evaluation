package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_nullCode_returnsNull {

    private CssFormatter cssFormatter;

    @Before
    public void setUp() throws Exception {
        cssFormatter = new CssFormatter();
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