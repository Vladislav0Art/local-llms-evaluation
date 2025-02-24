package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testTextNodeConstructor() {
        String text = "test";

        TextNode textNode = new TextNode(text);

        assertEquals(text, textNode.text());
    }

}