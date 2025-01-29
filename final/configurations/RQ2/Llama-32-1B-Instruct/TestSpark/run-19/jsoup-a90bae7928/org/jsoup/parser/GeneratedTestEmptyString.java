package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestEmptyString {

    @Test
    public void testEmptyString() {
        String input = "";
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

}