package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParserReturnsCorrectParser {

    @Test
    public void parserReturnsCorrectParser() {
        Parser parser = new Parser();
        Document document = new Document("http://example.com");
        Document result = document.parser(parser);
        assertNotNull(result);
        assertEquals(parser, result.parser());
    }

}