package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() throws IOException {
        Document document = new Document("html", "", Parser.xmlParser());
        Document outputSettings = (Document) document.outputSettings(); // cast to existing class
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 1, outputSettings);
        assertEquals("<!--data-->", outContent.toString());
    }

}