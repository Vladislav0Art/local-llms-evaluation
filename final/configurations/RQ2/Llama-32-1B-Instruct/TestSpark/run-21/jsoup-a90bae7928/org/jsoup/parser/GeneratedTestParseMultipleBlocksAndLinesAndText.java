package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseMultipleBlocksAndLinesAndText {

    @Test
    public void testParseMultipleBlocksAndLinesAndText() throws Exception {
        String input = "New Text\n\n\n\nNew Text";
        String expected = new String("New Text");
        Parser parser = new Parser();
        Node node = parser.parse(input);
        if (node instanceof CodeBlock) {
            ((CodeBlock) node).getText().setText(expected);
        }
    }

}