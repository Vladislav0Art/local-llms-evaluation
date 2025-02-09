package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedNodeName_NonBlankTextNode_ReturnsText {

    @Test
    public void nodeName_NonBlankTextNode_ReturnsText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.getNodeName());
    }

}