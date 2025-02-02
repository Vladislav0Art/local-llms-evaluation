package org.jsoup.nodes;

public class GeneratedOuterHtml_GivenBlankTextNode_ReturnsEmptyString {

    @Test
    public void outerHtml_GivenBlankTextNode_ReturnsEmptyString() {
        String text = "";
        TextNode textNode = new TextNode(text);
        String result = textNode.outerHtml();
        assertTrue(result.isEmpty());
    }

}