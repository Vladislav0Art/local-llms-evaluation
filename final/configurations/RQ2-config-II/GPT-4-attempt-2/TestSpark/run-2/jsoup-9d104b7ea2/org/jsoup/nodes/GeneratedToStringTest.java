package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void ToStringTest() {
        TextNode textNode = new TextNode("ToString Test");
        assertEquals("ToString Test", textNode.toString());
    }

}