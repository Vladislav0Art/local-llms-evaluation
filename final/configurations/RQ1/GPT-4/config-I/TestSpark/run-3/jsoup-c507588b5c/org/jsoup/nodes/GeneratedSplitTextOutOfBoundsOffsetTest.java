package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOutOfBoundsOffsetTest {

    @Test
    public void splitTextOutOfBoundsOffsetTest() {
        TextNode tn = new TextNode("test");
        tn.splitText(6);
    }

}