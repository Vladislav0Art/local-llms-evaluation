package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCreateTextNode_MultipleCharacters {

    @Test
    public void createTextNode_MultipleCharacters() {
        String text = "hello world";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
        assertEquals("hello world", node.getWholeText());
    }

}