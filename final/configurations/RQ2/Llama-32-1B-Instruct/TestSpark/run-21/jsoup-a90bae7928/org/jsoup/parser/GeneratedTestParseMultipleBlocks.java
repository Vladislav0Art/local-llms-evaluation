package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseMultipleBlocks {

    @Test
    public void testParseMultipleBlocks() throws Exception {
        String input = "New Text\n\nNew Text";
        String expected = new String("New Text");
        Parser parser = new Parser();
        Node node = parser.parse(input);
        if (node instanceof CodeBlock) {
            ((CodeBlock) node).getText().setText(expected);
        }
    }

}