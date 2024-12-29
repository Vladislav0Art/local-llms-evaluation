package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatMultipleRules {

    @Test
    public void testCssFormatMultipleRules() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String input = "body { color: blue; } span { font-size: 12px; }";
        LineEnding ending = LineEnding.CRLF;
        Object actual = formatter.doFormat(input, ending);
        assertThat(actual, is("body { color: blue; }\nspan { font-size: 12px; }"));
    }

}