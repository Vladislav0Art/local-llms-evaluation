package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateFromEncoded_textIsBlank_returnsBlank {

    @Test
    public void createFromEncoded_textIsBlank_returnsBlank() {
        String encodedText = "&amp;lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertTrue(textNode.isBlank());
    }

}