package net.revelc.code.formatter.css;

public class GeneratedTestCssFormatting {

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

}