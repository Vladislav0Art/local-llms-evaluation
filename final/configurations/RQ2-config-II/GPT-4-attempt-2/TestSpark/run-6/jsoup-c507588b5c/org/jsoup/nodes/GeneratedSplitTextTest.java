package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Entities.EscapeMode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Sample Text");
        TextNode splittedNode = textNode.splitText(6);
        assertEquals("Text", splittedNode.text());
        assertEquals("Sample ", textNode.text());
    }

}