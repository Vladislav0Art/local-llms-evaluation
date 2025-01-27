package net.revelc.code.formatter.css;

public class GeneratedDoFormatEmptyString_test {

    private CssFormatter formatter;

    @Test
    public void doFormatEmptyString_test() {
        String code = "";
        LineEnding ending = LineEnding.LF;
        try {
            formatter.doFormat(code, ending);
            assert false : "Expected IOException to be thrown";
        } catch (IOException e) {
        }
    }

}