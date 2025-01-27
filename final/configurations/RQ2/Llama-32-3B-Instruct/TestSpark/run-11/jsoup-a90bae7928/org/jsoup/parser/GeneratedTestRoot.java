package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestRoot {

    @Test
    public void testRoot() {
        String xml = "<root><child/></root>";
        Reader input = new java.io.StringReader(xml);
        Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals("root", document.root().tagName());
    }

}