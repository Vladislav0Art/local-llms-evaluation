package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCloneTextNode_DifferentContent {

    @Test
    public void cloneTextNode_DifferentContent() {
        String text1 = "hello";
        String text2 = "world";
        TextNode node1 = new TextNode(text1);
        TextNode node2 = new TextNode(text2);
        assertNotSame(node1, node2);
        assertEquals("hello", node1.getWholeText());
        assertEquals("world", node2.getWholeText());
    }

}