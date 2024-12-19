package org.jsoup.nodes;

public class GeneratedSplitText_setsCorrectOffset_atStart {

    private TextNode textNode;

    @Test
    public void splitText_setsCorrectOffset_atStart() {
        String originalText = "abcdef";
        int offset = 0;
        textNode.setWholeText(originalText);
        TextNode expectedNode = new TextNode("abc");
        expectedNode.text("abc");
        assertEquals(expectedNode, textNode.splitText(offset));
    }

}