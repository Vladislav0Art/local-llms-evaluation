package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNodeName_AnonymousTextNode_ReturnsTagName {

    @Test
    public void nodeName_AnonymousTextNode_ReturnsTagName() {
        TextNode node = new TextNode("");
        assertEquals("text", node.nodeName());
    }

}