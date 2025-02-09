package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = new Parser(doc);
        Document docWithParser = doc.parser(parser);
        assertEquals(docWithParser.parser(), parser);
    }

}