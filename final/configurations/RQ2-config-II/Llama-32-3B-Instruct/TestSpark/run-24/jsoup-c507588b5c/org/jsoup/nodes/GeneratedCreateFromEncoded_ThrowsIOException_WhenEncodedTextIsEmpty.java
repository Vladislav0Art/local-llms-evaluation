package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_ThrowsIOException_WhenEncodedTextIsEmpty {

    @Test
    public void createFromEncoded_ThrowsIOException_WhenEncodedTextIsEmpty() {
        expectException(IOException.class).value(() -> TextNode.createFromEncoded(""));
    }

}