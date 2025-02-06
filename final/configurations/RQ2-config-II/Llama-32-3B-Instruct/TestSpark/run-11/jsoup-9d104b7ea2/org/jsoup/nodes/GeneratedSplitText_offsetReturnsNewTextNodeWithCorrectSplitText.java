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

public class GeneratedSplitText_offsetReturnsNewTextNodeWithCorrectSplitText {

    @Test
    public void splitText_offsetReturnsNewTextNodeWithCorrectSplitText() {
        TextNode originalTextNode = new TextNode("test");
        int offset = 1;
        TextNode newTextNode = originalTextNode.splitText(offset);
        assertEquals(3, newTextNode.text().length());
    }

}