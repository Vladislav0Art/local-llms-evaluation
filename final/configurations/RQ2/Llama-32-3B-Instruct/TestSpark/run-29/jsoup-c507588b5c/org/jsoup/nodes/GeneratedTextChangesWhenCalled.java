package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTextChangesWhenCalled {

    @Test
    public void textChangesWhenCalled() {
        String originalText = "Hello";
        TextNode node = new TextNode(originalText);
        String newText = "World";
        node.text(newText);
        assertEquals(newText, node.text());
    }

}