package net.revelc.code.formatter.css;

public class GeneratedTestDoFormat_invalidCode_throwsIOException {

    private CssFormatter cssFormatter;

    @Before
    public void setUp() throws Exception {
        cssFormatter = new CssFormatter();
    }

    @Test
    public void testDoFormat_invalidCode_throwsIOException() {
        // Arrange
        String code = "invalid code";
        LineEnding lineEnding = LineEnding.UNIX;

        // Act and Assert
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, lineEnding));
    }

}