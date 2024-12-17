package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextualRepresentationString {

    @Test
    public void testTextualRepresentationString() {
        String numStr = "Hello";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(numStr, doc);
        assertEquals("Hello", Main.toString(doc, node));
    }

}