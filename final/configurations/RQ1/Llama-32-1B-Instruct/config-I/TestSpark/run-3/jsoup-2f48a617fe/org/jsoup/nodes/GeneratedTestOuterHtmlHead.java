package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestOuterHtmlHead {

    private Document doc;
    private Parser parser;

    public void setup() throws Parser.ParseError {
        parser = new Parser();
        doc = parser.parseInput("<!DOCTYPE html><body></body>", new StringReader(""));
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        setup();
        String expected = "<html><head></head><body></body></html>";
        Elements outputElements = doc.body().child(0).elements();
        assert 6 == outputElements.length();
    }

}