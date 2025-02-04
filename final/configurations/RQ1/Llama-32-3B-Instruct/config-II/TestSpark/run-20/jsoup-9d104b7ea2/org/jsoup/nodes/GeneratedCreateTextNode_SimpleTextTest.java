package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedCreateTextNode_SimpleTextTest {

    private void setup() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void CreateTextNode_SimpleTextTest() {
        setup();
        TextNode node = createTextNode("Hello World");
        String output = node.toString();
        assertEquals("<p>Hello World</p>", output);
    }

}