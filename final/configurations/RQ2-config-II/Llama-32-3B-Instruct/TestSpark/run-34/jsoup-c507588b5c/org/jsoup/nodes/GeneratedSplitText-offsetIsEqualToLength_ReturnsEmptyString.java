package org.jsoup.nodes;

public class GeneratedSplitText-

offsetIsEqualToLength_ReturnsEmptyString {

    @Test
    public void splitText -offsetIsEqualToLength_ReturnsEmptyString() {
        TextNode node = new TextNode("Hello");
        TextNode result = node.splitText(node.length());
        assertSame("", result.text());
    }

}