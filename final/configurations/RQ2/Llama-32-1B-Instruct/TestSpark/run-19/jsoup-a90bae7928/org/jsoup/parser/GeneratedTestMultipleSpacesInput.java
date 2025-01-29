package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestMultipleSpacesInput {

    @Test
    public void testMultipleSpacesInput() {
        String input = "   ";
        Parser parser = new Parser();
        try {
            parser.parse(input);
            fail("Expected ParseException");
        } catch (ParseException e) {
            // expected
        }
    }

    public static class Parser {
        private int index;

        public void parse(String input) throws ParseException {
            for (; ; ) {
                if (index >= input.length()) break;
                char ch = input.charAt(index);
                switch (ch) {
                    case ' ':
                        try {
                            parser.parseSpace();
                        } catch (ParseException e) {
                            fail("Unexpected ParseException");
                        }
                        break;

                    default:
                        break;
                }

                index++;
            }
        }

        public void parseSpace() throws ParseException {
            int count = 0;
            while (index < input.length() && input.charAt(index).isspace()) {
                count++;
                index++;
            }
        }

        @Override
        protected String getExceptionMessage() {
            return "Unexpected ParseException";
        }
    }

}