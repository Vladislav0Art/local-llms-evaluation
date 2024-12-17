package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlank_NoWhitespaceNodes_SimpleString_Test {

    @Test
    public void isBlank_NoWhitespaceNodes_SimpleString_Test() {
        String text = "Hello World";
        assertTrue(new TextNode(text).isBlank());
    }

}