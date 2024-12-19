package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = (TextNode) node.clone();
        assertNotNull(clonedNode);
        assertEquals(node, clonedNode);
    }

}