package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatNoLineBreak {

    @Test
    public void testCssFormatNoLineBreak() {
        CssFormatter formatter = new CssFormatter();
        String input = "body { color: blue; }";
        LineEnding ending = LineEnding.PCF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is(""));
    }

}