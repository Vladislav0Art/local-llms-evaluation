package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextChangeTest {

    @Test
    public void textChangeTest() {
        TextNode tn = new TextNode("test text");
        tn.text("changed text");
        assertEquals("changed text", tn.text());
    }

}