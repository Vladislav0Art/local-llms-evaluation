package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestTextSetterTest {

    @Test
    public void testTextSetterTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("changed!");
        assertEquals("changed!", textNode.text());
    }

}