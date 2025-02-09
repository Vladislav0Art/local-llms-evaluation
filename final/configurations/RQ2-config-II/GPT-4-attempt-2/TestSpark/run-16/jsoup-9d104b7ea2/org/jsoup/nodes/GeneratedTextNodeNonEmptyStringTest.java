package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeNonEmptyStringTest {

    @Test
    public void TextNodeNonEmptyStringTest() {
        String str = "Some text";
        TextNode node = new TextNode(str);
        assertEquals(node.text(), str);
    }

}