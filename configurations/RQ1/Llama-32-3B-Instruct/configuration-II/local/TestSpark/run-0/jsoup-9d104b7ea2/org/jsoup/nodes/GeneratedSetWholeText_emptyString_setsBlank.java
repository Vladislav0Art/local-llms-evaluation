package org.jsoup.nodes;

public class GeneratedSetWholeText_emptyString_setsBlank {

    private TextNode textNode;

    @Test
    public void setWholeText_emptyString_setsBlank() {
        textNode.setWholeText("");
        assertTrue(textNode.isBlank());
    }

}