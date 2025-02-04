package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_InvalidOffset_ThrowsException {

    @Test
    public void splitText_InvalidOffset_ThrowsException() throws IOException {
        String encodedText = "&lt;Test&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }
}

}