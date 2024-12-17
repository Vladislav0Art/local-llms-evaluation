package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_normaliseWhitespace_empty {

    @Test
    public void test_normaliseWhitespace_empty() {
        String string = "";
        String normalised = normaliseWhitespace(string);
        assertEquals("", normalised);
    }

}