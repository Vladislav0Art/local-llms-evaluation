package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedGetTextTest {

    @Test
    public void getTextTest() {
        TextNode textNode = new TextNode("Testing");
        assertEquals("Testing", textNode.text());
    }

}