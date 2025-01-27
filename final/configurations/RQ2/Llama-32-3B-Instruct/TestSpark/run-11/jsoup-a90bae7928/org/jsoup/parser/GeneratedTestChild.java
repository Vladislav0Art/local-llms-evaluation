package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestChild {

    @Test
    public void testChild() {
        String xml = "<root><child>&amp;</child></root>";
        Reader input = new java.io.StringReader(xml);
        Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals(1, document.body().children().size());
        assertEquals("child", document.body().children().first().tagName());
    }

}