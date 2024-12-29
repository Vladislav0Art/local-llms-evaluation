package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatEmptyInput {

    @Test
    public void testCssFormatEmptyInput() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String input = "{body { color: blue; }";
        LineEnding ending = LineEnding.LF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is(""));
    }

}