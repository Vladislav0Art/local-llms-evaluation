package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

public class GeneratedNormaliseWhitespace_SingleSpace_ReturnsCorrectWhitespace {

    @Test
    public void normaliseWhitespace_SingleSpace_ReturnsCorrectWhitespace() {
        String text = " ";
        String result = TextNode.normaliseWhitespace(text);
        assertEquals("", result);
    }

}