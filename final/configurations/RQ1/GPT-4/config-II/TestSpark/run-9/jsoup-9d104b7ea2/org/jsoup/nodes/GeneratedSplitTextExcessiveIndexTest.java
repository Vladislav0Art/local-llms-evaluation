package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextExcessiveIndexTest {

    @Test
    public void splitTextExcessiveIndexTest() {
        TextNode textNode = new TextNode("Hello");
        textNode.splitText(6);
    }

}