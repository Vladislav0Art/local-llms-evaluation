package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingComments {

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

}