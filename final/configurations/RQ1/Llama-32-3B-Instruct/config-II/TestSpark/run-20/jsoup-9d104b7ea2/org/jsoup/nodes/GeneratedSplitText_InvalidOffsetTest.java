package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedSplitText_InvalidOffsetTest {

    private void setup() {
        System.setOut(new PrintStream(new ByteArrayOutputStream()));
    }

    public TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void splitText_InvalidOffsetTest() {
        TextNode node = createTextNode("Hello World");
        assertThrows(IndexOutOfBoundsException.class, () -> node.splitText(-1));
    }

}