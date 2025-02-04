package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedIsBlank_test {

    @Test
    public void isBlank_test() {
        TextNode textNode1 = new TextNode(" ");
        assertTrue(textNode1.isBlank());

        TextNode textNode2 = new TextNode("");
        assertTrue(textNode2.isBlank());

        TextNode textNode3 = new TextNode("Hello World");
        assertFalse(textNode3.isBlank());
    }

}