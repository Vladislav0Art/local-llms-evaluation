package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseNull {

    @Test
    public void testParseNull() {
        String input = null;
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

}