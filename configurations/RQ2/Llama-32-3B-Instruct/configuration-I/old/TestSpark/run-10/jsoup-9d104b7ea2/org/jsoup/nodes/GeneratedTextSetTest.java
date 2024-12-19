package org.jsoup.nodes;

public class GeneratedTextSetTest {

    @Test
    public void textSetTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode();
        textNode.text(text);
        assertEquals(text, textNode.text());
    }

}