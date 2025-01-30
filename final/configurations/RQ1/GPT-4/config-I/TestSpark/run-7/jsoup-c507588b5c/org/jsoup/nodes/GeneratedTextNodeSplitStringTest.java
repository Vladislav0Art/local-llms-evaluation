package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeSplitStringTest {

    @Test
    public void textNodeSplitStringTest() {
        String text = "some text";
        TextNode tn = new TextNode(text);
        TextNode splitNode = tn.splitText(4);
        assertEquals("some", tn.getWholeText());
        assertEquals(" text", splitNode.getWholeText());
    }

}