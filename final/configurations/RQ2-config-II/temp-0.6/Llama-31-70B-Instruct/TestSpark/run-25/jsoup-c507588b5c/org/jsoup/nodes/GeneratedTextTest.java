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

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("   test   ");
        assertEquals("test", textNode.text());
        textNode.text("   new test   ");
        assertEquals("new test", textNode.text());
    }

}