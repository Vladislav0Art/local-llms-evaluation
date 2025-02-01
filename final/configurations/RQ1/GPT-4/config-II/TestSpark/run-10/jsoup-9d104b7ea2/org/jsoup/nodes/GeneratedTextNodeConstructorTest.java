package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("test");

        assertEquals("test", textNode.coreValue());
    }

}