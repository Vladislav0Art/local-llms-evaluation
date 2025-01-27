package net.revelc.code.formatter.css;

public class GeneratedDoFormatMultipleLinesFormat {

    private CssFormatter cssFormatter;

    @Test
    public void doFormatMultipleLinesFormat() throws IOException {
        String code = "body {\n" +
                "  font-size: 16px;\n" +
                "}\n" +
                "\n" +
                "#header { color: #333; }";
        LineEnding ending = LineEnding.CRLF;
        cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), new ConfigurationSourceStub());
        assertEquals(code, cssFormatter.doFormat(code, ending));
    }

}