package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateTextNode_fromBlankText_textIsEmptyTest {

    @Test
    public void createTextNode_fromBlankText_textIsEmptyTest() {
        String text = "";
        TextNode textNode = TextNode.createFromEncoded(text);
        assertTrue(textNode.isBlank());
    }

}