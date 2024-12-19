package org.jsoup.nodes;

public class GeneratedClone_setsCorrectValue {

    private TextNode textNode;

    @Test
    public void clone_setsCorrectValue() {
        String originalText = "Hello World";
        textNode.setWholeText(originalText);
        TextNode clonedNode = textNode.clone();
        assertEquals(originalText, clonedNode.getWholeText());
    }

}