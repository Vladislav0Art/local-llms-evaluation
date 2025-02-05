package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextWithParamTest {

    @Test
    public void textWithParamTest() {
        TextNode node = new TextNode("test");
        node.text("other");
        assertEquals("other", node.text());
    }

}