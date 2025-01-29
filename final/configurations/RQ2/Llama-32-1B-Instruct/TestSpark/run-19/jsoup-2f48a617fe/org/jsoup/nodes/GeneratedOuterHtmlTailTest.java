package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlTailTest {

    public static String nodeName(Comment comment) {
        return "Comment";
    }

    public static String getData(Comment comment) {
        return comment.getData();
    }

    @Test
    public void outerHtmlTailTest() {
        Document document = new Document();
        Element element = document.createElement("html");
        element.appendChild(document.createElement("head"));
        element.appendChild(document.createElement("body"));
        Comment comment = new Comment("<!DOCTYPE html><html><head><title>Test</title></head><body>" + "<p>This is a test comment</p>" + "</body></html>");
        String expectedOuterHtmlTail = "<!DOCTYPE html><html><head><title>Test</title></head><body><p>This is a test comment</p></body></html>";
        assertEquals(expectedOuterHtmlTail, comment.outerHtmlTail(new Parser(), new Parser(), null));
    }

}