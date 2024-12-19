package org.jsoup.nodes;

public class GeneratedGetWholeText_returnsCorrectValue {

    private TextNode textNode;

    @Test
    public void getWholeText_returnsCorrectValue() {
        String originalText = "abc";
        textNode.setWholeText(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

}