package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_ThrowsIOExceptionForInvalidOffset {

    @Test
    public void splitText_ThrowsIOExceptionForInvalidOffset() throws IOException {
        TextNode node = new TextNode("Hello World");
        assertThrows(IOException.class, () -> node.splitText(-1));
    }

}