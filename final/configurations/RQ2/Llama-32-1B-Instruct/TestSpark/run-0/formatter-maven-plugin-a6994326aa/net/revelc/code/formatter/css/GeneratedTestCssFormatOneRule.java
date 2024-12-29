package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatOneRule {

    @Test
    public void testCssFormatOneRule() {
        CssFormatter formatter = new CssFormatter();
        String input = "body { color: blue; }";
        LineEnding ending = LineEnding.CRLF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is("body { color: blue; }"));
    }

}