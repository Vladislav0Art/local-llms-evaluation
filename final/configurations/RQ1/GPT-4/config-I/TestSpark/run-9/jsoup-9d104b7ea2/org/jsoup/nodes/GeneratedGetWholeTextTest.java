package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedGetWholeTextTest {

    @Test
    public void getWholeTextTest() {
        TextNode tn = new TextNode(" test text ");
        String wholeText = tn.text();
        assertEquals("test text", wholeText);
    }

}