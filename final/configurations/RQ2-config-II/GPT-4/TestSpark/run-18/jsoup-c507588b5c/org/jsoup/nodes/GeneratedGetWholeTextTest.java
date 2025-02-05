package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        String sampleText = "sample text";
        TextNode node = new TextNode(sampleText);
        assertEquals(sampleText, node.getWholeText());
    }

}