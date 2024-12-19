package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedOuterHtmlTail_PassesDepthAndSettings {

    @Test
    public void outerHtmlTail_PassesDepthAndSettings() {
        Document document = new org.jsoup.nodes.Document();
        Appendable accum = new java.util.StringBuilder();
        int depth = 1;
        Document.OutputSettings out = new org.jsoup.Document.OutputSettings();
        Comment comment = new Comment("Hello World!");
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(accum.toString().contains("-->"));
    }

}