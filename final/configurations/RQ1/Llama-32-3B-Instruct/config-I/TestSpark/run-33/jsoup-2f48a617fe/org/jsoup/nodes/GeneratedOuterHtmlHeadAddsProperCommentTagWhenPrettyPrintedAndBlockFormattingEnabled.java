package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedOuterHtmlHeadAddsProperCommentTagWhenPrettyPrintedAndBlockFormattingEnabled {

    @Test
    public void outerHtmlHeadAddsProperCommentTagWhenPrettyPrintedAndBlockFormattingEnabled() {
        Document doc = new Document();
        Element html = new Element("html");
        doc.appendChild(html);
        Element head = new Element("head");
        doc.appendChild(head);
        Comment comment = new Comment();
        comment.setBlock(true);
        comment.setText("<!-- XML declaration -->");
        head.appendChild(comment.outerHtml());
        String htmlString = doc.toString();
        assertTrue(htmlString.contains("<!--"));
        assertTrue(htmlString.contains("-->"));
    }

}