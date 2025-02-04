package org.jsoup.nodes;

public class GeneratedSplitTextByTextOffset_TextBeforeOffset_ReturnsTextNodeWithCorrectText {

    @Test
    public void splitTextByTextOffset_TextBeforeOffset_ReturnsTextNodeWithCorrectText() {
        String text = "abcdef";
        int offset = 3;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);

        assertEquals(originalTextNode.getWholeText(), resultTextNode.getWholeText());
    }

}