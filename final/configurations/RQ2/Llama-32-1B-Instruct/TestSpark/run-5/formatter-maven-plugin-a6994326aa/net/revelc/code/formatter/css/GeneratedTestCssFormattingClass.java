package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingClass {

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

}