package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNewTextNodeSplittingTest {

    @Test
    public void newTextNodeSplittingTest() throws IOException {
        TextNode textNode = new TextNode("Hello\nWorld");
        TextNode newNode = textNode.splitText(6);
        assertEquals("World", newNode.text());
    }

}