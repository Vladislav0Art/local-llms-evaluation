package org.jsoup.nodes;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitText = textNode.splitText(2);
        assertNotNull(splitText);
    }

}