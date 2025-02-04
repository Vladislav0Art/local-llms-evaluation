package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSplitText_GivenTextNodeWithNegativeOffset_ReturnsBlankTextNode {

    @Test
    public void splitText_GivenTextNodeWithNegativeOffset_ReturnsBlankTextNode() {
        String rawText = "   Hello,   World!  ";
        TextNode textNode = new TextNode(rawText);
        int offset = -10;
        TextNode expectedTextNode = new TextNode();
        TextNode actualTextNode = textNode.splitText(offset);
        assertNotNull(actualTextNode);
        assertEquals(expectedTextNode, actualTextNode);
    }

}