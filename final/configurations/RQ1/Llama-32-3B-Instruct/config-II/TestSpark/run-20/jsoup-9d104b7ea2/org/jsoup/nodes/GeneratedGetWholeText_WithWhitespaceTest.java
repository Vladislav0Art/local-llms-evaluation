package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedGetWholeText_WithWhitespaceTest {

    private void setup() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void getWholeText_WithWhitespaceTest() {
        TextNode node = createTextNode(" Hello World  ");
        String output = node.getWholeText();
        assertEquals(" Hello World  ", output);
    }

}