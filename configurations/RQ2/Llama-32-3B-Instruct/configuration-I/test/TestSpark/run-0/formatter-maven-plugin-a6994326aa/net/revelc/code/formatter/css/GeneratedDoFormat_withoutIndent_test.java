package net.revelc.code.formatter.css;

public class GeneratedDoFormat_withoutIndent_test {

    @Test
    public void doFormat_withoutIndent_test() {
        String code = "body { background-color: #fff; }";
        LineEnding ending = LineEnding.LF;
        when(mock(ConfigurationSource.class).getOptionValue("indent")).thenReturn("");
        assertThrows(FormatterException.class, () -> new CssFormatter().doFormat(code, ending));
    }

}