package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_clone {

    @Test
    public void test_clone() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        TextNode originalTextNode = document.createTextNode("Original Text");
        append(originalTextNode, accum, 0);
        originalTextNode = (TextNode) document.cloneNode(true).addChild(originalTextNode);
        assertEquals(originalTextNode, document.getText().toString());
    }

}