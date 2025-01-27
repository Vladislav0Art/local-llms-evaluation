package net.revelc.code.formatter.css;

public class GeneratedDoFormatInvalidCodeFormat {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatInvalidCodeFormat() throws IOException {
        String code = " invalid code";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("", cssFormatter.doFormat(code, ending));
    }

}