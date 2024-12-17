package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_stringToString {

    @Test
    public void test_stringToString() {
        String string = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(string);
        assertEquals("Hello World", textNode.toString());
    }

}