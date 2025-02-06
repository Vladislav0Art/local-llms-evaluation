package org.jsoup.nodes;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        TextNode node = new TextNode("<p>Hello</p>");
        String expected = "<p>Hello</p>";
        assertEquals(expected, node.toString());
    }

}