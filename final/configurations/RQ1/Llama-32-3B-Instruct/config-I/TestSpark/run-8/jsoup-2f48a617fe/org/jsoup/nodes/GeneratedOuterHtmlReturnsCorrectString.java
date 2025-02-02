package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlReturnsCorrectString {

    @Test
    public void outerHtmlReturnsCorrectString() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable appendable = outContent;
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("Hello World");
        comment.outerHtml(appendable, depth, outputSettings);
        assertEquals("<!--Hello World--><!DOCTYPE html>", outContent.toString());
    }

}