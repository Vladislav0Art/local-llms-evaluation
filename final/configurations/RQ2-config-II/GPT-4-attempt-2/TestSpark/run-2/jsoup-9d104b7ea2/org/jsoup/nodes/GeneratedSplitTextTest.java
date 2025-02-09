package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void SplitTextTest() {
        TextNode textNode = new TextNode("Split Text");
        assertEquals("Split", textNode.splitText(5).text());
    }

}