package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedTextNodeIsBlankTestsBlankString {

    @Test
    public void textNodeIsBlankTestsBlankString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}