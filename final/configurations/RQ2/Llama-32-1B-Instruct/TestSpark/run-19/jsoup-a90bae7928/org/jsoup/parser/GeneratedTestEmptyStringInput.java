package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestEmptyStringInput {

    @Test
    public void testEmptyStringInput() {
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