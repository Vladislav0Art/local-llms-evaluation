package org.jsoup.nodes;

public class GeneratedSplitTextSplitAtOffsetThrowsInvalidOffsetException {

    @Test
    public void splitTextSplitAtOffsetThrowsInvalidOffsetException() {
        String text = "Hello World!";
        int offset = -1;
        assertThrows(IllegalArgumentException.class, () -> new TextNode(text).splitText(offset));
    }

}