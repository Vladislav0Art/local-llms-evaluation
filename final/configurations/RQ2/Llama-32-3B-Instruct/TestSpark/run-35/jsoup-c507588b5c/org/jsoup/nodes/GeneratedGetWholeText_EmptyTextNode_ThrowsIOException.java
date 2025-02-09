package org.jsoup.nodes;

public class GeneratedGetWholeText_EmptyTextNode_ThrowsIOException {

    @Test
    public void getWholeText_EmptyTextNode_ThrowsIOException() {
        // Given:
        TextNode node = new TextNode("");

        // When:
        assertThrows(IOException.class, () -> node.getWholeText());
    }

}