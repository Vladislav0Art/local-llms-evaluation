package net.revelc.code.formatter.css;

public class GeneratedDoFormat_withLineBreak_test {

    @Test
    public void doFormat_withLineBreak_test() {
        String code = "body {\n  background-color: #fff; }\n";
        LineEnding ending = LineEnding.CRLF;
        when(mock(ConfigurationSource.class).getOptionValue("indent")).thenReturn("");
        String expectedOutput = "  body{\n    background-color: #fff;\n  }\n";
        assertEquals(expectedOutput, new CssFormatter().doFormat(code, ending));
    }

}