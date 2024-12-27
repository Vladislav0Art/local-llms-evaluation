package net.revelc.code.formatter.css;

public class GeneratedDoFormat_withValidCode_test {

    @Test
    public void doFormat_withValidCode_test() {
        String code = "body { background-color: #fff; }";
        LineEnding ending = LineEnding.LF;
        when(mock(ConfigurationSource.class).getOptionValue("indent")).thenReturn("");
        String expectedOutput = "  body { background-color: #fff; }\n";
        assertEquals(expectedOutput, new CssFormatter().doFormat(code, ending));
    }

}