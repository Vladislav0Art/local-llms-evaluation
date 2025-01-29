package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        String expectedOutput = "<p>Hello World</p>";
        assertEquals(expectedOutput, node.toString());
    }

}