package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentInnerHtmlTailNode {

    @Test
    public void testCommentInnerHtmlTailNode() {
        // Test Comment Inner Html Tail Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

}