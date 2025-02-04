package org.jsoup.nodes;

public class GeneratedSplitTextByTextOffset_InvalidOffset_ThrowsIllegalArgumentException {

    @Test
    public void splitTextByTextOffset_InvalidOffset_ThrowsIllegalArgumentException() {
        String text = "abcdef";
        int offset = 10;
        TextNode originalTextNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> originalTextNode.splitText(offset));
    }

}