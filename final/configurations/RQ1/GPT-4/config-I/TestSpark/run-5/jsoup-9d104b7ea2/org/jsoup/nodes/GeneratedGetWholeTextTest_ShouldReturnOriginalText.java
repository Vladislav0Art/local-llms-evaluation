package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetWholeTextTest_ShouldReturnOriginalText {

    @Test
    public void getWholeTextTest_ShouldReturnOriginalText() {
        TextNode textNode = new TextNode("   Hello,     world!   ");
        assertEquals("   Hello,     world!   ", textNode.getWholeText());
    }

}