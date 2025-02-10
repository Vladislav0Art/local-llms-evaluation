package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyInput {

    private CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void doFormatEmptyInput() {
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