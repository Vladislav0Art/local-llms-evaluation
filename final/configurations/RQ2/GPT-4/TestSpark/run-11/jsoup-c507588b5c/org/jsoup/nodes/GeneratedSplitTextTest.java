package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode tn = new TextNode("sample");
        TextNode tn2 = tn.splitText(2);
        assertEquals("sam", tn.text());
        assertEquals("ple", tn2.text());
    }

}