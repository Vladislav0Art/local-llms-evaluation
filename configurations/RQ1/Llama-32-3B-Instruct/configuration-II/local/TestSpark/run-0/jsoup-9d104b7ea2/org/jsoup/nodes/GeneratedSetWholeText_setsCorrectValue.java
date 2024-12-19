package org.jsoup.nodes;

public class GeneratedSetWholeText_setsCorrectValue {

    private TextNode textNode;

    @Test
    public void setWholeText_setsCorrectValue() {
        String originalText = "abc";
        textNode.setWholeText(originalText);
        assertEquals(originalText, textNode.getWholeText());
    }

}