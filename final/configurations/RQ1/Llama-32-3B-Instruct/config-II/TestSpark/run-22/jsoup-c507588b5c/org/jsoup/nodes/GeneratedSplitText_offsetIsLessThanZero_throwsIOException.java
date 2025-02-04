package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitText_offsetIsLessThanZero_throwsIOException {

    @Test
    public void splitText_offsetIsLessThanZero_throwsIOException() {
        TextNode textNode = new TextNode("Hello, World!");
        try {
            textNode.splitText(-1);
            assert false;
        } catch (IOException e) {
            // Expected
        }
    }

}