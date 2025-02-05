package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextGetTextTest {

    @Test
    public void textGetTextTest() {
        String sampleText = "sample text";
        TextNode node = new TextNode(sampleText);
        assertEquals(sampleText, node.text());
    }

}