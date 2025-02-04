package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailShouldNotIncludeAnyData {

    @Test
    public void outerHtmlTailShouldNotIncludeAnyData() {
        Comment comment = new Comment("This is a test");
        Document document = new Document();
        Appendable appendable = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(appendable, depth, out);
        assertEquals("", appendable.toString());
    }

}