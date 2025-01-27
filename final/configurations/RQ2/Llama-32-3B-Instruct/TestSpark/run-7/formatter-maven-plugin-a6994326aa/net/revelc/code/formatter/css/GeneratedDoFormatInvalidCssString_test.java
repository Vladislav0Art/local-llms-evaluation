package net.revelc.code.formatter.css;

public class GeneratedDoFormatInvalidCssString_test {

    private CssFormatter formatter;

    @Test
    public void doFormatInvalidCssString_test() throws IOException {
        String code = "invalid css";
        LineEnding ending = LineEnding.LF;
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected IOException to be thrown";
        } catch (IOException e) {
        }
    }

}