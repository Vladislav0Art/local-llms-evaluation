package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextualRepresentationNonString {

    @Test
    public void testTextualRepresentationNonString() {
        String numStr = "10";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(numStr, doc);
        assertEquals("10", Main.toString(doc, node));
    }

}