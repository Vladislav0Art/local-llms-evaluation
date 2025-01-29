package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingEmptyFunction {

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

}