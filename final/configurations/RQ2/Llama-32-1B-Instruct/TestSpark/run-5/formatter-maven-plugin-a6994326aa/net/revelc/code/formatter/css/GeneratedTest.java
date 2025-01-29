package net.revelc.code.formatter.css;

public class GeneratedTest {

    @Test
    public void testCssFormatting() throws IOException {
        String cssCode = "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode);

        assertEquals("body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingLineNumbers() throws IOException {
        String cssCode = "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CSSFormat format = formatter.doFormat(cssCode, LineEnding.LF);

        assertEquals("body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingComments() throws IOException {
        String cssCode = "// This is a comment\n" +
                "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode, LineEnding.CRLF);

        assertEquals("body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingEmptyStyle() throws IOException {
        String cssCode = "{}\n" +
                "body {\n" +
                "    font-size: 16px;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode, LineEnding.LF);

        assertEquals("body {\n" +
                "    font-size: 16px;\n" +
                "}\n", format.toString());
    }

    @Test
    public void testCssFormattingEmptyClass() throws IOException {
        String cssCode = "{\n" +
                "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode, LineEnding.CRLF);

        assertEquals("body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingEmptyFunction() throws IOException {
        String cssCode = "function test() {}\n" +
                "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode);

        assertEquals("function test() {}\n" +
                "body {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingClass() throws IOException {
        String cssCode = ".test {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode);

        assertEquals(".test {\n" +
                "    font-size: 16px;\n" +
                "    color: #333;\n" +
                "}", format.toString());
    }

    @Test
    public void testCssFormattingElement() throws IOException {
        String cssCode = ".test {\n" +
                "    background-color: blue;\n" +
                "}";

        CssFormatter formatter = new CssFormatter();
        CssFormat format = formatter.doFormat(cssCode);

        assertEquals(".test {\n" +
                "    background-color: blue;\n" +
                "}", format.toString());
    }

}