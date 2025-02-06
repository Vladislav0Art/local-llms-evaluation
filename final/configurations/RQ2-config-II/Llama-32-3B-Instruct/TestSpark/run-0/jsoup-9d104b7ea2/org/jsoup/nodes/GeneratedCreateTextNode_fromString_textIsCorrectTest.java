package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateTextNode_fromString_textIsCorrectTest {

    @Test
    public void createTextNode_fromString_textIsCorrectTest() {
        String text = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertEquals(text, textNode.text());
    }

}