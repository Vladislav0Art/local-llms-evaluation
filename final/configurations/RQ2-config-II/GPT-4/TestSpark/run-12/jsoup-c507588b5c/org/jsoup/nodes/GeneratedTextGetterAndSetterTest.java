package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextGetterAndSetterTest {

    @Test
    public void textGetterAndSetterTest() {
        TextNode textNode = new TextNode("");
        textNode.text("test text");
        assertEquals("test text", textNode.text());
    }

}