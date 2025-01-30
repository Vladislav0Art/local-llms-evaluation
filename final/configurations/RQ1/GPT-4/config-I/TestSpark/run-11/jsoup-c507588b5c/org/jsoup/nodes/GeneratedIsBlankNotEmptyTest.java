package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIsBlankNotEmptyTest {

    @Test
    public void isBlankNotEmptyTest() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}