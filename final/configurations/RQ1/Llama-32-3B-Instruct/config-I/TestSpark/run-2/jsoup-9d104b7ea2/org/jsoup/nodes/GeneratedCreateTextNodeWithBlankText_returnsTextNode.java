package org.jsoup.nodes;

public class GeneratedCreateTextNodeWithBlankText_returnsTextNode {

    @Test
    public void createTextNodeWithBlankText_returnsTextNode() {
        String blankText = "";
        TextNode textNode = new TextNode(blankText);
        assertNotNull(textNode);
        assertTrue(textNode.isBlank());
    }

}