package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestParseCodeBlock {

    @Test
    public void testParseCodeBlock() {
        String string = "[Hello World]";
        Parser parser = new Parser();
        List<Node> expectedNodes = new ArrayList<>();

        for (Node node : parser.parse(string)) {
            if (node instanceof CodeBlock) {
                ((CodeBlock) node).getText().set(0, "New Text");
            }
            expectedNodes.add(node);
        }

        assertTrue(expectedNodes.containsAll(parser.getNodes()));
    }

}