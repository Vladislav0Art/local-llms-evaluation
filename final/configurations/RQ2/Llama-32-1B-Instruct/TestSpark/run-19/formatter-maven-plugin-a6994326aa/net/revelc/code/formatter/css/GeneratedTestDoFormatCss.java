package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatCss {

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