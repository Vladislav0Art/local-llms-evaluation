package net.revelc.code.formatter.css;

public class GeneratedDoFormatNoLineEnding {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatNoLineEnding() {
        try {
            cssFormatter.doFormat("", net.revelc.code.formatter.LineEnding.LF);
            fail("Expected IOException");
        } catch (java.io.IOException e) {
        }

        try {
            cssFormatter.doFormat("", net.revelc.code.formatter.LineEnding.CRLF);
            fail("Expected IOException");
        } catch (java.io.IOException e) {
        }
    }

}