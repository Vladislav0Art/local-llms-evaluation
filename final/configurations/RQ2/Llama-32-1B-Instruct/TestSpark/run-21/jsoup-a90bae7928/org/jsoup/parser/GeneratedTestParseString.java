package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseString {

    @Test
    public void testParseString() {
        String string = "Hello World";
        Parser parser = new Parser();
        List<Node> expectedNodes = new ArrayList<>();

        for (Node node : parser.parse(string)) {
            if (node instanceof TextNode) {
                ((TextNode) node).setText("Test");
            } else if (node instanceof CodeBlock) {
                ((CodeBlock) node).getText().set(0, "Test");
            }
        }

        assertTrue(expectedNodes.containsAll(parser.getNodes()));
    }

}