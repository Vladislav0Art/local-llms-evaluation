package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingEmptyStyle {

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

}