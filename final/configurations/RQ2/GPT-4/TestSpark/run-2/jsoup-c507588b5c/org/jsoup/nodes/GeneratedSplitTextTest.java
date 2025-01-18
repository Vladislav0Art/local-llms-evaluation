package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("test");
        TextNode splitTextNode = tn.splitText(2);
        assertEquals("st", splitTextNode.text());
        assertEquals("te", tn.text());
    }

}