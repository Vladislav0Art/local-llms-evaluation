package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIsBlankEmptyTest {

    @Test
    public void isBlankEmptyTest() {
        String text = " ";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}