package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    @Test
    public void OuterHtmlTailDoesNotAppendAnything() throws IOException {
        Parser parser = new Parser(ParseSettings.parseAll());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = parser.parse("<comment>Hello World</comment>");
        LeafNode node = document.head().children().get(0);
        Comment comment = (Comment) node;
        comment.outerHtmlTail(out, 0, null);
        assertTrue(out.toString().isEmpty());
    }

}