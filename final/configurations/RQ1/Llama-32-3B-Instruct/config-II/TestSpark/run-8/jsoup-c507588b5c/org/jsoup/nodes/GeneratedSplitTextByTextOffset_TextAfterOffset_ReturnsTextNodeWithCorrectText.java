package org.jsoup.nodes;

public class GeneratedSplitTextByTextOffset_TextAfterOffset_ReturnsTextNodeWithCorrectText {

    @Test
    public void splitTextByTextOffset_TextAfterOffset_ReturnsTextNodeWithCorrectText() {
        String text = "abcdef";
        int offset = 0;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);

        assertEquals(originalTextNode.getWholeText(), resultTextNode.getWholeText());
    }

}