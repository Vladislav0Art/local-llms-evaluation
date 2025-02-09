package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        Document document = new XmlTreeBuilder().parse(new StringReader("<xml></xml>"), "http://google.com");
        assertEquals("<xml></xml>", document.html());
    }

}