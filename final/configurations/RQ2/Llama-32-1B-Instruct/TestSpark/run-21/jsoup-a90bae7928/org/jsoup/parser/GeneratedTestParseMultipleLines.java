package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseMultipleLines {

    @Test
    public void testParseMultipleLines() throws Exception {
        String input = "New Text\nNew Text";
        String expected = new String("New Text");
        Parser parser = new Parser();
        Node node = parser.parse(input);
        if (node instanceof Text) {
            ((Text) node).setText(expected);
        }
    }

}