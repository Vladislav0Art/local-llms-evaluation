package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsBlank_ReturnsCorrectBoolean {

    @Test
    public void isBlank_ReturnsCorrectBoolean() {
        String text = "";
        Document doc = new Document();
        TextNode node = doc.newTextNode(text);
        assertTrue(node.isBlank());

        text = "   ";
        node = doc.newTextNode(text);
        assertTrue(node.isBlank());
    }

}