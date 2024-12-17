package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestTextualRepresentation {

    @Test
    public void testTextualRepresentation() {
        String str = "<p>Hello, world!</p>";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(str, doc);
        assertEquals("Hello, world!", Main.toString(doc, node));

        // Test case 2: Split and get text between tags
        str = "<p>Hello, <b>world!</b></p>";
        assertEquals(6, Main.toString(doc, node).split("\n").length);
    }

}