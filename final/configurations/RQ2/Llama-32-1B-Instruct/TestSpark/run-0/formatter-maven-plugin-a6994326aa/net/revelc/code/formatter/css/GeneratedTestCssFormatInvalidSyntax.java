package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class GeneratedTestCssFormatInvalidSyntax {

    @Test
    public void testCssFormatInvalidSyntax() throws Exception {
        CssFormatter formatter = new CssFormatter();
        String input = "body { color: blue; } span { font-size: 12px !important; }";
        LineEnding ending = LineEnding.CRLF;
        try {
            formatter.doFormat(input, ending);
            fail("Expected IOException");
        } catch (Exception e) {
            is(e.getMessage(), "Invalid CSS syntax");
        }
    }

}