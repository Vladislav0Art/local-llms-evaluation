package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlTailDoesNotAppendToStream {

    @Test
    public void outerHtmlTailDoesNotAppendToStream() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document outputSettings = new Document.OutputSettings(false, true);
        Comment comment = new Comment("Hello, World!");
        comment.outerHtmlTail(accum, 0, outputSettings);
        String expected = "";
        assertEquals(expected, outContent.toString());
    }

}