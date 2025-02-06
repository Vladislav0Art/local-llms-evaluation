package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetWholeTextReturnsCorrectString {

    @Test
    public void getWholeTextReturnsCorrectString() {
        String text = "textNode ";
        TextNode node = new TextNode(text);
        assertEquals(text, node.getWholeText());
    }

}