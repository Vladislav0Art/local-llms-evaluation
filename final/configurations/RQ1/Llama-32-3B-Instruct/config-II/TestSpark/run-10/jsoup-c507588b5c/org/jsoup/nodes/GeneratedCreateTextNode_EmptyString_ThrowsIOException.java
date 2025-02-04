package org.jsoup.nodes;

public class GeneratedCreateTextNode_EmptyString_ThrowsIOException {

    @Test
    public void createTextNode_EmptyString_ThrowsIOException() {
        assertThrows(IOException.class, () -> new TextNode(""));
    }

}