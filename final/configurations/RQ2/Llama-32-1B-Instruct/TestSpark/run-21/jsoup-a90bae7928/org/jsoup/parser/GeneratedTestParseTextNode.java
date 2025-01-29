package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseTextNode {

    @Test
    public void testParseTextNode() {
        String string = "Hello World";
        Parser parser = new Parser();
        Node node = parser.parse(string).get(0);

        if (node instanceof TextNode) {
            ((TextNode) node).setText("New Text");
        } else if (node instanceof CodeBlock) {
            ((CodeBlock) node).getText().set(0, "New Text");
        }
    }

}