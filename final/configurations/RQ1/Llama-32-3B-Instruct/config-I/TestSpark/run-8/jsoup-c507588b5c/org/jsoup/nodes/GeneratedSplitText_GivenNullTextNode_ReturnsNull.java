package org.jsoup.nodes;

public class GeneratedSplitText_GivenNullTextNode_ReturnsNull {

    @Test
    public void splitText_GivenNullTextNode_ReturnsNull() {
        assertNull(TextNode.createFromEncoded(null).splitText(0));
    }

}