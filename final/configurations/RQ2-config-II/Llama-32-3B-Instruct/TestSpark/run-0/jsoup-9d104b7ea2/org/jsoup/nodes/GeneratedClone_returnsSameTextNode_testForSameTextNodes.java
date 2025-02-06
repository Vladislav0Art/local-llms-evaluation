package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedClone_returnsSameTextNode_testForSameTextNodes {

    @Test
    public void clone_returnsSameTextNode_testForSameTextNodes() {
        String text = "Hello World";
        TextNode originalTextNode = new TextNode(text);
        TextNode clonedTextNode = originalTextNode.clone();
        assertTrue(originalTextNode == clonedTextNode);
    }

}