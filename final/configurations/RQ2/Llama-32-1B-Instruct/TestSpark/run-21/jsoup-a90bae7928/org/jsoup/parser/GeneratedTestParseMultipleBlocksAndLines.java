package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseMultipleBlocksAndLines {

    @Test
    public void testParseMultipleBlocksAndLines() throws Exception {
        String input = "New Text\n\n\nNew Text";
        String expected = new String("New Text");
        Parser parser = new Parser();
        Node node = parser.parse(input);
        if (node instanceof CodeBlock) {
            ((CodeBlock) node).getText().setText(expected);
        }
    }

}