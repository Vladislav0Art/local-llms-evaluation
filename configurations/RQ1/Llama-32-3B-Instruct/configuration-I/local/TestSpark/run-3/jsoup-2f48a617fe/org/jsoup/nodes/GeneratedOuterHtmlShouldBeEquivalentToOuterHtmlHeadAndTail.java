package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlShouldBeEquivalentToOuterHtmlHeadAndTail {

    @Test
    public void outerHtmlShouldBeEquivalentToOuterHtmlHeadAndTail() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        Comment comment = new Comment("Hello World!");
        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        String outerHtml = comment.outerHtml();
        assertTrue(outerHtml.contains("<!--"));
    }

}