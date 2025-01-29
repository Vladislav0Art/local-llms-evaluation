package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Test
    public void testInit() {
        final AbstractCacheableFormatter formatter = new CssFormatter();
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void testFormatCss() throws IOException {
        String cssCode = "<style>\n" +
                "  body { background-color: #f2f2f2; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }

    @Test
    public void testFormatCssWithOptions() throws IOException {
        String cssCode = "<style>\n" +
                "  body { color: blue; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }

    @Test
    public void testDoFormat() throws IOException {
        String cssCode = "<style>\n" +
                "  body { background-color: #f2f2f2; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }

    @Test
    public void testDoFormatCss() throws IOException {
        String cssCode = "<style>\n" +
                "  body { color: blue; }\n" +
                "</style>";
        LineEnding ending = LineEnding.LF_LINE;
        CSSOMParser parser = new SACParserCSS3();
        parser.parse(new InputSource(cssCode));
        CSSFormat format = parser.getCssFormat();
        assertEquals(ending, format.getLineEndings());
    }
}

class GeneratedTest extends CssFormatterTest {

    @Override
    public void setUp() {
        super.setUp();
    }

    @Override
    protected void tearDown() {
        super.tearDown();
    }

}