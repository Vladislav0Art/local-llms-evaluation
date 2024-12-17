package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlankTests {

    @Test
    public void isBlankTests() {
        String text = "";
        assertTrue(new TextNode(text).isBlank());
        String whitespaceText = "   ";
        assertTrue(new TextNode(whitespaceText).isBlank());
    }

}