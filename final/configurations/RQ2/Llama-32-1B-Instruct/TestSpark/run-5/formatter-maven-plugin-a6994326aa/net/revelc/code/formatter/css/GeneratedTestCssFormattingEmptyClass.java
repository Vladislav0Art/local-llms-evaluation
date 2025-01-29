package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingEmptyClass {

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

}