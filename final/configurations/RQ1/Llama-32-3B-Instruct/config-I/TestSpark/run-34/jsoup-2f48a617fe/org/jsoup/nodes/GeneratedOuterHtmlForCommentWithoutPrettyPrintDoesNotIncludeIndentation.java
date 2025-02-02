package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedOuterHtmlForCommentWithoutPrettyPrintDoesNotIncludeIndentation {

    @Test
    public void outerHtmlForCommentWithoutPrettyPrintDoesNotIncludeIndentation() {
        when(out.prettyPrint()).thenReturn(false);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        MockOut out = new MockOut();
        when(out.out()).thenReturn(new StringBuilder());
        Comment comment = new Comment("some data");
        Document document = Document.valueOf(comment);
        element = document.body().children().first();
        element.outerHtmlHead(new StringBuilder(), 0, out);
    }

}