package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParserMethodReturnsCorrectParser {

    @Test
    public void parserMethodReturnsCorrectParser() {
        Parser parser = Parser.createDefault();
        Document document = new Document();
        document.parser(parser);
        assertNotNull(document.parser());
    }

}