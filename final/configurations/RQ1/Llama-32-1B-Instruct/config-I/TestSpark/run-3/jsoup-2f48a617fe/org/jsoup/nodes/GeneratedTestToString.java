package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestToString {

    private Document doc;
    private Parser parser;

    public void setup() throws Parser.ParseError {
        parser = new Parser();
        doc = parser.parseInput("<!DOCTYPE html><body></body>", new StringReader(""));
    }

    @Test
    public void testToString() throws IOException {
        setup();
        String content = "<p>This is a paragraph</p>";
        Comment comment = new Comment(doc.body().child(0));
        assertEquals("<p>This is a paragraph</p>", comment.toString());
    }

}