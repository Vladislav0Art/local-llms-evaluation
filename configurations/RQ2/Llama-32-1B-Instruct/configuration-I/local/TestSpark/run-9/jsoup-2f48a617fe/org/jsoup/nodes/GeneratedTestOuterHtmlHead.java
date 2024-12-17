package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        document.body().appendChild(commentElement);
        commentElement.outerHtmlHead(document, 1, null);

        assertEquals("<!-- This is a sample comment -->", commentElement.outerHtml());
    }

}