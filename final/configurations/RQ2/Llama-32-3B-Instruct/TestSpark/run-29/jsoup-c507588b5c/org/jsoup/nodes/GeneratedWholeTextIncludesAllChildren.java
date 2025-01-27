package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedWholeTextIncludesAllChildren {

    @Test
    public void wholeTextIncludesAllChildren() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        assertTrue(node.getWholeText().equals(originalText));
    }

}