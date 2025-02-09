package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentInputContextBaseUriParserTest {

    @Test
    public void parseFragmentInputContextBaseUriParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        Document document = builder.parse("<html><body></body></html>", "http://example.com");
        List nodes = builder.parseFragment("<p>Paragraph</p>", document.body(), "http://example.com", parser);
        assertFalse(nodes.isEmpty());
    }

}