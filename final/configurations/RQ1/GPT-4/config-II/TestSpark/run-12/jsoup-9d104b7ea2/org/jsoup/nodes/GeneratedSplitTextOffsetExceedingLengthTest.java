package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextOffsetExceedingLengthTest {

    @Test
    public void splitTextOffsetExceedingLengthTest() {
        TextNode textNode = new TextNode("Hello, World!");
        textNode.splitText(50);
    }

}