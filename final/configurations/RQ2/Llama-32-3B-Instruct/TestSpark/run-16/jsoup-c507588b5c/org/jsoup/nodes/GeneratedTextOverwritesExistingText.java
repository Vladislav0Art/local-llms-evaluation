package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTextOverwritesExistingText {

    @Test
    public void textOverwritesExistingText() {
        TextNode textNode = new TextNode("Initial Text");
        textNode.text("New Text");
        String expectedText = "New Text";
        assertEquals(expectedText, textNode.text());
    }

}