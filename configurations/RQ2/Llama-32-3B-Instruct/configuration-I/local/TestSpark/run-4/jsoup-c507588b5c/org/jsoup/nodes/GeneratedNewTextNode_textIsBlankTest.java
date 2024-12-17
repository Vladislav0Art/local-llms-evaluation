package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewTextNode_textIsBlankTest {

    @Test
    public void newTextNode_textIsBlankTest() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}