package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedParserSetterTest {

    @Test
    public void parserSetterTest() throws IOException {
        Parser parser = new Parser();
        Document document = new Document();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}