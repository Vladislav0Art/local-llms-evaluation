package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlank_WhitespaceNodes_EmptyString_Test {

    @Test
    public void isBlank_WhitespaceNodes_EmptyString_Test() {
        String text = "\n";
        assertTrue(new TextNode(text).isBlank());
    }

}