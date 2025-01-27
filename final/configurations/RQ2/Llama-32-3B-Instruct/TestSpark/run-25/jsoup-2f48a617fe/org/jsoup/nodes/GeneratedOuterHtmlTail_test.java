package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() {
        Document document = new Document("html", "", Parser.xmlParser());
        Document.OutputSettings out = (Document.OutputSettings) document.outputSettings(); // cast to existing class
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 1, out);
        assertEquals("", accum.toString());
    }

}