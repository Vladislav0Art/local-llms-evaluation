package org.jsoup.nodes;

public class GeneratedSplitText_setsCorrectOffset {

    private TextNode textNode;

    @Test
    public void splitText_setsCorrectOffset() {
        String originalText = "abcdef";
        int offset = 3;
        textNode.setWholeText(originalText);
        TextNode expectedNode = new TextNode("def");
        expectedNode.text("def");
        assertEquals(expectedNode, textNode.splitText(offset));
    }

}