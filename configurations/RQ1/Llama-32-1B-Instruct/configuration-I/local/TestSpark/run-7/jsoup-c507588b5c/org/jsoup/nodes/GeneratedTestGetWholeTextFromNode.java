package org.jsoup.nodes;

public class GeneratedTestGetWholeTextFromNode {

    @Test
    public void testGetWholeTextFromNode() {
        // Test that getWholeText returns the correct text from a TextNode (including newlines and spaces)
        TextNode doc = new TextNode("<p>Hello World!</p>");
        String expected = "Hello World!";
        assertEquals(expected, doc.getText());
    }

}