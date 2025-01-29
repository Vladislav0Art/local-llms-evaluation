package net.revelc.code.formatter.css;

import net.revelc.code.formatter.CSSFormatter;

import java.io.IOException;

public class GeneratedDoFormatNoCssScenarioTest {

    @Test
    public void doFormatNoCssScenarioTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF - Line;
        CssFormatter formatter = new CSSFormatter(code, ending);
        assertEquals(0, formatter.options.size());
    }

}