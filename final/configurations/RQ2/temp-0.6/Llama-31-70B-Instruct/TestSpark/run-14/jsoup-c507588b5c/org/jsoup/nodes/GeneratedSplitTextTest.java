package org.jsoup.nodes;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Some Text");
        TextNode splitTextNode = textNode.splitText(5);
        assertEquals("Text", splitTextNode.text());
    }

}