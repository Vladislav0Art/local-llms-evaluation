package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "   sample   text   ";
        text = TextNode.normaliseWhitespace(text);
        assertEquals(" sample text ", text);
    }

}