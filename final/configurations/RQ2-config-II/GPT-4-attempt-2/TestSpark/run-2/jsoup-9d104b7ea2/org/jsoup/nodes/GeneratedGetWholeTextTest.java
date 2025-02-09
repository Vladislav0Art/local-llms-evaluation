package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void GetWholeTextTest() {
        TextNode textNode = new TextNode("Get Whole Text");
        assertEquals("Get Whole Text", textNode.getWholeText());
    }

}