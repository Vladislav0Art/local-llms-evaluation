package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTest {

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

    @Test
    public void testTextualRepresentationMultipleParagraphs() {
        String str = "<p>Hello, world!</p><p>This is another paragraph.</p>";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(str, doc);
        assertEquals("Hello, world!\nThis is another paragraph.", Main.toString(doc, node));

        // Test case 2: Split and get text between tags
        str = "<p>Hello, <b>world!</b></p><p>This is another paragraph.</p>";
        assertEquals(4, Main.toString(doc, node).split("\n").length);
    }

    @Test
    public void testTextualRepresentationSingleWord() {
        String str = "<p>Hello, world!</p>";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(str, doc);
        assertEquals("Hello, world!", Main.toString(doc, node));

        // Test case 2: Split and get text between tags
        str = "<p>Hello, <b>world!</b></p>";
        assertEquals(5, Main.toString(doc, node).split("\n").length);
    }

    @Test
    public void testTextualRepresentationNonString() {
        String numStr = "10";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(numStr, doc);
        assertEquals("10", Main.toString(doc, node));
    }

    @Test
    public void testTextualRepresentationString() {
        String numStr = "Hello";

        // Test case 1: Get whole text of a node
        Document doc = new Document();
        Node node = (Node) Main.parse(numStr, doc);
        assertEquals("Hello", Main.toString(doc, node));
    }

}