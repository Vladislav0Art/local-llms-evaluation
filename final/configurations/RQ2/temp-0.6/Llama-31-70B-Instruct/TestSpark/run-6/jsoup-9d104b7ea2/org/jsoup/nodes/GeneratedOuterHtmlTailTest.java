package org.jsoup.nodes;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.outerHtmlTail(null, 0, null));
    }

}