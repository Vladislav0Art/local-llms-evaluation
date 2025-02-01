package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextInvalidOffsetTest {

    @Test
    public void splitTextInvalidOffsetTest() {
        TextNode textNode = new TextNode("split text");
        textNode.splitText(20);
    }

}