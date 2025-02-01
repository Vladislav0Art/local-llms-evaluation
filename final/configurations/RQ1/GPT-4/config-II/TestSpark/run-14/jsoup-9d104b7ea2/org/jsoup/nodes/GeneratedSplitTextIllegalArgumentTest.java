package org.jsoup.nodes;

import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSplitTextIllegalArgumentTest {

    @Test
    public void splitTextIllegalArgumentTest() {
        TextNode textNode = new TextNode("Hello, world!");
        textNode.splitText(-1);
    }

}