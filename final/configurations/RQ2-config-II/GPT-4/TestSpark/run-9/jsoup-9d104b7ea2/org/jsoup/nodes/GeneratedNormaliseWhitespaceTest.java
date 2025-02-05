package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = " Test         text ";
        String normalised = TextNode.normaliseWhitespace(text);

        assertEquals(" Test text ", normalised);
    }

}