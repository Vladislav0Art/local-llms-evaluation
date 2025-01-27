package net.revelc.code.formatter.css;

public class GeneratedDoFormatNonCssString_test {

    private CssFormatter formatter;

    @Test
    public void doFormatNonCssString_test() {
        String code = "not css";
        LineEnding ending = LineEnding.LF;
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected IOException to be thrown";
        } catch (IOException e) {
        }
    }

}