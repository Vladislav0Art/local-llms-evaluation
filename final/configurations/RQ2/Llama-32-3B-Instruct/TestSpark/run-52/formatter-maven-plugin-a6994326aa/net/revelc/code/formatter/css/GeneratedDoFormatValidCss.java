package net.revelc.code.formatter.css;

public class GeneratedDoFormatValidCss {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatValidCss() throws java.io.IOException {
        String code = ".test { width: 100px; }";
        String formattedCss = cssFormatter.doFormat(code, net.revelc.code.formatter.LineEnding.CRLF);
        assertNotNull(formattedCss);
    }

}