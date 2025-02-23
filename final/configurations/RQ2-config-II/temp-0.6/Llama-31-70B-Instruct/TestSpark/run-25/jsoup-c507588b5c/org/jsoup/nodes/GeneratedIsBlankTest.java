package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        TextNode textNode1 = new TextNode("");
        assertTrue(textNode1.isBlank());
        TextNode textNode2 = new TextNode("   ");
        assertTrue(textNode2.isBlank());
        TextNode textNode3 = new TextNode("   text   ");
        assertTrue(!textNode3.isBlank());
    }

}