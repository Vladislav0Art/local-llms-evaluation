package org.jsoup.nodes;

public class GeneratedSplitText_setsCorrectOffset_atEnd {

    private TextNode textNode;

    @Test
    public void splitText_setsCorrectOffset_atEnd() {
        String originalText = "abcdef";
        int offset = 3;
        textNode.setWholeText(originalText);
        TextNode expectedNode = new TextNode("cdef");
        expectedNode.text("cdef");
        assertEquals(expectedNode, textNode.splitText(offset));
    }

}