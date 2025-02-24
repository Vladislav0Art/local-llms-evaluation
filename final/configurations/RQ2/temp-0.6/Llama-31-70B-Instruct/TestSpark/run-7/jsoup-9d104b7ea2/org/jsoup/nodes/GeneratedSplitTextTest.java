package org.jsoup.nodes;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Test");
        TextNode newTextNode = textNode.splitText(2);
        assertEquals("st", newTextNode.text());
    }

}