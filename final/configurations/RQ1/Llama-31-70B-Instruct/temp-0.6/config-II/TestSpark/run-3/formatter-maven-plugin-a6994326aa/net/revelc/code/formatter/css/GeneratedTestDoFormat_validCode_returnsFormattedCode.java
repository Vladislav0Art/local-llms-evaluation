package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_validCode_returnsFormattedCode {

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

}