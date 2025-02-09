package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentInputBaseUriParserTest {

    @Test
    public void parseFragmentInputBaseUriParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        List nodes = builder.parseFragment("<html></html>", "http://example.com", parser);
        assertFalse(nodes.isEmpty());
    }

}