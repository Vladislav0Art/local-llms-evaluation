package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedIsBlank_WhitespaceOnly_ReturnsTrue {

    @Test
    public void isBlank_WhitespaceOnly_ReturnsTrue() {
        String text = "\t\n\r";
        TextNode node = new TextNode(text);
        assertTrue(node.isBlank());
    }

}