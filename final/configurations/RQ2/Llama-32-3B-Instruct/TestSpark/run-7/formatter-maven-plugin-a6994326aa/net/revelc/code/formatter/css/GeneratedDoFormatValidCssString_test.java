package net.revelc.code.formatter.css;

public class GeneratedDoFormatValidCssString_test {

    private CssFormatter formatter;

    @Test
    public void doFormatValidCssString_test() throws IOException {
        String code = "body { color: blue; }";
        LineEnding ending = LineEnding.LF;
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

}