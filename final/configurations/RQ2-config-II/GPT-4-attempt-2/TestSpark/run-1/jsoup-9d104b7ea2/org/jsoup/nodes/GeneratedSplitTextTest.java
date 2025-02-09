package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("split this text");
        TextNode newText = textNode.splitText(5);
        assertEquals("split", textNode.getWholeText());
        assertEquals(" this text", newText.getWholeText());
    }

}