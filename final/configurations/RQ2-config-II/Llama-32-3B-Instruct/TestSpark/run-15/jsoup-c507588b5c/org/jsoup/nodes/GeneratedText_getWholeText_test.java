package org.jsoup.nodes;

public class GeneratedText_getWholeText_test {

    @Test
    public void text_getWholeText_test() {
        String expected = "Hello\nWorld";
        TextNode node = new TextNode(expected);
        assertEquals(expected, node.getWholeText());
    }

}