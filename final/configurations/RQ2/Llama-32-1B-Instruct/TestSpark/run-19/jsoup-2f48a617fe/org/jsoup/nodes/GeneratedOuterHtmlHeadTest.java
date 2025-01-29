package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlHeadTest {

    public static String nodeName(Comment comment) {
        return "Comment";
    }

    public static String getData(Comment comment) {
        return comment.getData();
    }

    @Test
    public void outerHtmlHeadTest() {
        Document document = new Document();
        Element element = document.createElement("html");
        element.appendChild(document.createElement("head"));
        element.appendChild(document.createElement("body"));
        Comment comment = new Comment("<!DOCTYPE html><html><head><title>Test</title></head><body>" + "<p>This is a test comment</p>" + "</body></html>");
        String expectedOuterHtmlHead = "<!DOCTYPE html><html><head><title>Test</title></head><body><p>This is a test comment</p></body></html>";
        assertEquals(expectedOuterHtmlHead, comment.outerHtmlHead(new Parser(), new Parser(), null));
    }

}