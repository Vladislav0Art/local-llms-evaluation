package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_NegativeOffset_ThrowsIllegalArgumentException {

    @Test
    public void splitText_NegativeOffset_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(-1));
    }

}