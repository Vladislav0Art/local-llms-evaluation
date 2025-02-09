package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedClone_CloneReturnsSameObject {

    @Test
    public void clone_CloneReturnsSameObject() {
        TextNode textNode = new TextNode("Hello");
        TextNode cloned = (TextNode) textNode.clone();
        assertSame(cloned, ((TextNode) textNode.clone()));
    }

}