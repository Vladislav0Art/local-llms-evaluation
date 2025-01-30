package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(doc.parser().getClass(), Parser.class);
    }

}