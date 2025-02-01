package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTestWithNegativeOffset {

    @Test
    public void splitTextTestWithNegativeOffset() {
        TextNode textNode = new TextNode("hello world");
        textNode.splitText(-1);
    }

}