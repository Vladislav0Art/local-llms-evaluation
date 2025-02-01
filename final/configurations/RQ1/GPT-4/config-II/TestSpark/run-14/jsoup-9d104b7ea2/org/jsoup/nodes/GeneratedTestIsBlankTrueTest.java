package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsBlankTrueTest {

    @Test
    public void testIsBlankTrueTest() {
        TextNode textNode = new TextNode("         ");
        assertEquals(true, textNode.isBlank());
    }

}