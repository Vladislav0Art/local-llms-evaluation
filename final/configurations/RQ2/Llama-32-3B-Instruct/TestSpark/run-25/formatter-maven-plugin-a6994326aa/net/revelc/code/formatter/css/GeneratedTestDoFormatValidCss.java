package net.revelc.code.formatter.css;

public class GeneratedTestDoFormatValidCss {

    @Test
    public void testDoFormatValidCss() throws IOException {
        String cssCode = ".class {\n" +
                "  property: value;\n" +
                "}";
        InputSource input = new InputSource(new ByteArrayInputStream(cssCode.getBytes()));
        CssFormatter formatter = new CssFormatter();
        assertEquals(cssCode, formatter.doFormat(input));
    }

}