package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedClone_ReturnsCloneOfTextNode {

    @Test
    public void clone_ReturnsCloneOfTextNode() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

}