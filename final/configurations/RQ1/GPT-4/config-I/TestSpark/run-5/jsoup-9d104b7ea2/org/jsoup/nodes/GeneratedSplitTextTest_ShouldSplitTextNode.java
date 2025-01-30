package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedSplitTextTest_ShouldSplitTextNode {

    @Test
    public void splitTextTest_ShouldSplitTextNode() {
        TextNode textNode = new TextNode("LoremIpsum");
        TextNode newTextNode = textNode.splitText(5);
        assertEquals("Lorem", textNode.getWholeText());
        assertEquals("Ipsum", newTextNode.getWholeText());
    }

}