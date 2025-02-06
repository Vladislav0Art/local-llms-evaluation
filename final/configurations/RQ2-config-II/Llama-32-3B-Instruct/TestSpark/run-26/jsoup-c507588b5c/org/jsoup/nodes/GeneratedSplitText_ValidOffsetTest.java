package org.jsoup.nodes;

public class GeneratedSplitText_ValidOffsetTest {

    @Test
    public void splitText_ValidOffsetTest() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(3);
        assertEquals("te", result.text());
    }

}