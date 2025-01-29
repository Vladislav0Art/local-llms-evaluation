package net.revelc.code.formatter.css;

import net.revelc.code.formatter.CSSFormatter;

import java.io.IOException;

public class GeneratedDoFormatScenarioTest {

    @Test
    public void doFormatScenarioTest() throws IOException {
        String code = "body { background-color: #f2f2f2; }";
        LineEnding ending = LineEnding.LF - Line;
        CssFormatter formatter = new CSSFormatter(code, ending);
        String result = formatter.doFormat();
        assertEquals("body { background-color: #f2f2f2;}", result);
    }

}