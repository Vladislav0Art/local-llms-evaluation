package org.jsoup.nodes;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Some Text");
        assertEquals("Some Text", textNode.text());
    }

}