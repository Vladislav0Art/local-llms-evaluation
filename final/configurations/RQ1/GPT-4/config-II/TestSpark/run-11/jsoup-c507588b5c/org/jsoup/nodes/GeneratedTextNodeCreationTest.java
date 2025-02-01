package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTextNodeCreationTest {

    @Test
    public void textNodeCreationTest() {
        TextNode textNode = new TextNode("Test");
        assertNotNull(textNode);
        assertTrue(textNode instanceof TextNode);
    }

}