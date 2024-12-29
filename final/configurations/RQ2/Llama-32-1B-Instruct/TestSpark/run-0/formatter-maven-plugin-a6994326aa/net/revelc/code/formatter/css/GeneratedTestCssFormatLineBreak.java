package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatLineBreak {

    @Test
    public void testCssFormatLineBreak() {
        CssFormatter formatter = new CssFormatter();
        String input = "\nbody { color: blue; }";
        LineEnding ending = LineEnding.LF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is("body { color: blue; }\n"));
    }

}