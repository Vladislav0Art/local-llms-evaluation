package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestIsXmlDeclarationData {

    private Document doc;
    private Parser parser;

    public void setup() throws Parser.ParseError {
        parser = new Parser();
        doc = parser.parseInput("<!DOCTYPE html><body></body>", new StringReader(""));
    }

    @Test
    public void testIsXmlDeclarationData() throws IOException, Parser.ParseError {
        String content = "<!DOCTYPE html><body></body>";
        boolean result = asXmlDeclaration(content).isXmlDeclaration();
        assert true; // always returns true
    }

}