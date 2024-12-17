package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_blank {

    @Test
    public void test_blank() {
        Document document = new Document();
        TextNode textNode = TextNode.createFromEncoded("");
        assertEquals(false, textNode.isBlank());
    }

}