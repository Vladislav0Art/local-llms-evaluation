package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("Test");
        TextNode newTextNode = node.splitText(2);
        assertEquals("Te", node.getWholeText());
        assertEquals("st", newTextNode.getWholeText());
    }

}