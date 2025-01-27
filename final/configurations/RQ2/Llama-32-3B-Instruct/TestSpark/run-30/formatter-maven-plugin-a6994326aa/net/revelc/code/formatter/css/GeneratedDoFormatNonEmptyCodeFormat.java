package net.revelc.code.formatter.css;

public class GeneratedDoFormatNonEmptyCodeFormat {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatNonEmptyCodeFormat() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("body { background-color: #f2f2f2; }", cssFormatter.doFormat(code, ending));
    }

}