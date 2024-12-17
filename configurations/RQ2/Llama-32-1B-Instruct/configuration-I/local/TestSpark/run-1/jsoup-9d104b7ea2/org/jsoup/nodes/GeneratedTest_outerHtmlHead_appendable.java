package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import java.util.function.Function;

public class GeneratedTest_outerHtmlHead_appendable {

    @Test
    public void test_outerHtmlHead_appendable() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        document.outerHtmlHead(accum, 0);
        assertEquals("Hello World", accum.toString());
    }

}