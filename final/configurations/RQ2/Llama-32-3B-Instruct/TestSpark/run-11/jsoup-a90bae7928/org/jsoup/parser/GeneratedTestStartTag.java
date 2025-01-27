package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestStartTag {

    @Test
    public void testStartTag() {
        String xml = "<fragment><child/></fragment>";
        Reader input = new java.io.StringReader(xml);
        org.jsoup.nodes.Document document = Jsoup.parse(input, "", Parser.xmlParser());
        assertEquals("fragment", document.fragment().tagName());
        Token.StartTag startTag = Token.StartTag.DEFAULT;
        assert startTag == Token.StartTag fragment;
    }

}