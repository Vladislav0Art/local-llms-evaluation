package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetWholeTextTest {

    @Test
    public void testGetWholeTextTest() {
        TextNode textNode = new TextNode("  Hello, world!  ");
        assertEquals("  Hello, world!  ", textNode.getWholeText());
    }

}