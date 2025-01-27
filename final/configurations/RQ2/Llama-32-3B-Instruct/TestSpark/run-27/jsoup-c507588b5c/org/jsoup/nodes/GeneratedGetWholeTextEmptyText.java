package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedGetWholeTextEmptyText {

    @Test
    public void getWholeTextEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertEquals("", textNode.getWholeText());
    }

}