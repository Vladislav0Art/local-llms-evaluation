package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyCodeFormat {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatEmptyCodeFormat() throws IOException {
        String code = "";
        LineEnding ending = LineEnding.LF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals("", cssFormatter.doFormat(code, ending));
    }

}