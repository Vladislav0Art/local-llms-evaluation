package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    private Document doc;
    private Parser parser;

    public void setup() throws Parser.ParseError {
        parser = new Parser();
        doc = parser.parseInput("<!DOCTYPE html><body></body>", new StringReader(""));
    }

}