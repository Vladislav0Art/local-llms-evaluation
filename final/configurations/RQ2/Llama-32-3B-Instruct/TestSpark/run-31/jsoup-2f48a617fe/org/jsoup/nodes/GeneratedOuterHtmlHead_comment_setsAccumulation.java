package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedOuterHtmlHead_comment_setsAccumulation {

    @Test
    public void outerHtmlHead_comment_setsAccumulation() throws Exception {
        Document document = Document.parse("<html><head><comment>test</comment></head></html>");
        Comment comment = document.selectFirst("comment");
        assertEquals(comment.toString(), comment.setAccumulation());
    }

}