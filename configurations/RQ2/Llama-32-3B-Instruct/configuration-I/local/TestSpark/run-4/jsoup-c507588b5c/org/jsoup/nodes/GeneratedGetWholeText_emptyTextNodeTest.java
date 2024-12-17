package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetWholeText_emptyTextNodeTest {

    @Test
    public void getWholeText_emptyTextNodeTest() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.getWholeText());
    }

}