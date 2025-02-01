package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsBlankFalseTest {

    @Test
    public void testIsBlankFalseTest() {
        TextNode textNode = new TextNode("Hello, world!");
        assertEquals(false, textNode.isBlank());
    }

}