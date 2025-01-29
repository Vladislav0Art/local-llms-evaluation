package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseString {

    @Test
    public void testParseString() {
        String input = "hello";
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

}