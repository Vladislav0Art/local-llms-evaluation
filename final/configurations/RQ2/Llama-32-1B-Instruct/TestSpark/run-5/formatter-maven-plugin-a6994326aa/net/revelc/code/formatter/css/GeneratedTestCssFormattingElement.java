package net.revelc.code.formatter.css;

public class GeneratedTestCssFormattingElement {

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