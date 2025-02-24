package net.revelc.code.formatter.css;

public class GeneratedDoFormatTest {

    private CssFormatter formatter;

    @Test
    public void doFormatTest() throws IOException {
        formatter = new CssFormatter();
        String code = "body {background-color: red;}";
        LineEnding ending = LineEnding.UNIX;
        String formattedCode = formatter.doFormat(code, ending);
        assertNotNull(formattedCode);
    }

}