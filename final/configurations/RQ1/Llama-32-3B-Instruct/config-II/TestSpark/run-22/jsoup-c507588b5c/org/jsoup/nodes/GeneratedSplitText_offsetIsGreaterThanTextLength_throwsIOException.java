package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitText_offsetIsGreaterThanTextLength_throwsIOException {

    @Test
    public void splitText_offsetIsGreaterThanTextLength_throwsIOException() {
        TextNode textNode = new TextNode("Hello, World!");
        try {
            textNode.splitText(10);
            assert false;
        } catch (IOException e) {
            // Expected
        }
    }

}