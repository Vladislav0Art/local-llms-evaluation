package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingLineNumbers {

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

}