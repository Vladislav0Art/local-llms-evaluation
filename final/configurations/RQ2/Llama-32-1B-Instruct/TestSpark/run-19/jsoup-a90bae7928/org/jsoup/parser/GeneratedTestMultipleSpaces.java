package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestMultipleSpaces {

    @Test
    public void testMultipleSpaces() {
        String input = "   hello  ";
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

}