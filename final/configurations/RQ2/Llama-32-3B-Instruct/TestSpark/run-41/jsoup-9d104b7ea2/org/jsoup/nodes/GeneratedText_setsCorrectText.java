package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_setsCorrectText {

    @Test
    public void text_setsCorrectText() {
        TextNode node = new TextNode();
        node.text("");
        assertEquals("", node.text());
    }

}