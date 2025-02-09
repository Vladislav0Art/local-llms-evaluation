package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeEmptyStringTest {

    @Test
    public void TextNodeEmptyStringTest() {
        String str = "";
        TextNode node = new TextNode(str);
        assertTrue(node.isBlank());
    }

}