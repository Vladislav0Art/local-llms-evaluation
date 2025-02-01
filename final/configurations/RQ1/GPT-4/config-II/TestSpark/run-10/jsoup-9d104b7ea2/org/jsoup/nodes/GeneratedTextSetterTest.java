package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextSetterTest {

    @Test
    public void textSetterTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");

        assertEquals("new test", textNode.coreValue());
    }

}