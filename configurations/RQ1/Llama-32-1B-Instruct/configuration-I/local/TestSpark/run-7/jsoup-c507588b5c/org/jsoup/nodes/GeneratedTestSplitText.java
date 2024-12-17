package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Test that splitText splits the text into two nodes at the specified string offset
        TextNode doc = new TextNode("<p>Hello World!</p>");
        TextNode tail = doc.splitText(6);
        assertEquals("Hello ", tail.getText());
        assertNotNull(tail.getParent());
    }

}