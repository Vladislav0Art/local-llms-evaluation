package org.jsoup.nodes;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());

        textNode = new TextNode();
        assertNull(textNode.text());
    }

}