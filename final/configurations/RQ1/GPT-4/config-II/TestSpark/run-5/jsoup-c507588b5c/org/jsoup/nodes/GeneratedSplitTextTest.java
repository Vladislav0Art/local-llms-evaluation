package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("Split");
        TextNode splitNode = textNode.splitText(3);
        assertEquals("Spl", textNode.getWholeText());
        assertEquals("it", splitNode.getWholeText());
    }

}