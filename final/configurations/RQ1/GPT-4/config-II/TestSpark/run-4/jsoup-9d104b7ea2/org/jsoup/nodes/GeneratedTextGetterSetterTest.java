package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetterSetterTest {

    @Test
    public void textGetterSetterTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());

        textNode.text("AnotherTest");
        assertEquals("AnotherTest", textNode.text());
    }

}