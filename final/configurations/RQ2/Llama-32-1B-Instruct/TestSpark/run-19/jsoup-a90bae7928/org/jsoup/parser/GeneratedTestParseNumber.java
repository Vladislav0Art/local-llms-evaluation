package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseNumber {

    @Test
    public void testParseNumber() {
        String input = "123";
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

}