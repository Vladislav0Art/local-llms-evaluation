package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        TextNode tn = new TextNode("Hello World");
        assertEquals("Hello World", tn.toString());
    }

}