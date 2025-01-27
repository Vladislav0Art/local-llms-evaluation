package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedParserReturnsParserCorrectly {

    @Test
    public void parserReturnsParserCorrectly() {
        Parser parser = new Parser();
        Document doc = new Document();
        doc.parser(parser);
        assertNotNull(doc.parser());
    }

}