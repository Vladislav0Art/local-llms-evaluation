package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatEmptyString {

    @Test
    public void testCssFormatEmptyString() {
        CssFormatter formatter = new CssFormatter();
        String input = "";
        LineEnding ending = LineEnding.CRLF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is(""));
    }

}