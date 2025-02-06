package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText_setsNewTextTest {

    @Test
    public void text_setsNewTextTest() {
        String newText = " Foo Bar";
        TextNode node = new TextNode("Hello World!");
        node.text(newText);
        assertEquals(newText, node.text());
    }

}