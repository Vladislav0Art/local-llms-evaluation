package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadAddsCommentsToHead {

    @Test
    public void outerHtmlHeadAddsCommentsToHead() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document document = new Document("", outContent);
        Comment comment = new Comment("Hello World");
        Appendable append = new StringBuilder().append(document.outerHtml()).append("</head>");
        comment.outerHtmlHead(append, 0, new Document.OutputSettings());
        assertEquals("<head><comment>Hello World</comment></head>", outContent.toString().trim());
    }

}