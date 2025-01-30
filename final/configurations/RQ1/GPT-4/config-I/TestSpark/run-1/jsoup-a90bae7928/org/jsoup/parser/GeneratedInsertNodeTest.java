package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedInsertNodeTest {

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", Parser.xmlParser());

        xmlTreeBuilder.insert(new Token.StartTag("test"));
        Elements result = xmlTreeBuilder.doc.select("test");

        assertEquals(1, result.size());
    }

}