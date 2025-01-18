package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode tn = TextNode.createFromEncoded("sam&amp;ple");
        assertEquals("sam&ple", tn.getWholeText());
    }

}