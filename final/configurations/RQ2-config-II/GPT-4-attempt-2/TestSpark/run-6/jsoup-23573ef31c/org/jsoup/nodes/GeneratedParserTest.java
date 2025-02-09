package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParserTest {

    @Test
    public void parserTest() {
        Document document = new Document("https://sample.com");
        assertNotNull(document.parser());
    }

}