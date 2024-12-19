package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_outerHtmlTail_appendable {

    @Test
    public void test_outerHtmlTail_appendable() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        document.outerHtmlTail(accum, 0);
        assertEquals("", accum.toString());
    }

}