package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String sampleText = "sample text";
        TextNode node = new TextNode(sampleText);
        assertEquals(sampleText, node.toString());
    }

}