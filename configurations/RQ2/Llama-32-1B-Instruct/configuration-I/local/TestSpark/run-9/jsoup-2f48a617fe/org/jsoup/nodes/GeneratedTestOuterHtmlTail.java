package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        document.body().appendChild(commentElement);
        commentElement.outerHtmlTail(document, 1, null);

        assertEquals("<!-- This is a sample comment -->", commentElement.outerHtml());
    }

}