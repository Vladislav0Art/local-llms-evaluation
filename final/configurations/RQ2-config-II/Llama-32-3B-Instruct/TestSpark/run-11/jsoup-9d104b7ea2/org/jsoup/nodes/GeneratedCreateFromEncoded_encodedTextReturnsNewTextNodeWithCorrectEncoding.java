package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class GeneratedCreateFromEncoded_encodedTextReturnsNewTextNodeWithCorrectEncoding {

    @Test
    public void createFromEncoded_encodedTextReturnsNewTextNodeWithCorrectEncoding() {
        String encodedText = "expected";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.text());
    }

}