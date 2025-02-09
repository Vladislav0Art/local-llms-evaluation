package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTextTest {

    @Test
    public void setTextTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("newTest");
        String result = textNode.text();
        assertEquals("newTest", result);
    }

}