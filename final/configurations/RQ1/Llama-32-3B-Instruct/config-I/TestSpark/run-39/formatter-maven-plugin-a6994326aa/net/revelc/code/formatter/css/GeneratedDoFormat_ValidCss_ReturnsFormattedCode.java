package net.revelc.code.formatter.css;

public class GeneratedDoFormat_ValidCss_ReturnsFormattedCode {

    @Test
    public void doFormat_ValidCss_ReturnsFormattedCode() throws IOException {
        CssFormatter formatter = new CssFormatter();
        var options = Map.of("indent", "4");
        var result = formatter.doFormat(options);
        assertNotNull(result);
    }

}