package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentTail {

    @Test
    public void testCommentTail() {
        // Test Comment Tail
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

}