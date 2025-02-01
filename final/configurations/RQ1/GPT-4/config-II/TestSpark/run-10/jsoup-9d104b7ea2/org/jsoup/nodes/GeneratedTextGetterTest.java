package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetterTest {

    @Test
    public void textGetterTest() {
        TextNode textNode = new TextNode("  test  ");

        assertEquals("test", textNode.text());
    }

}