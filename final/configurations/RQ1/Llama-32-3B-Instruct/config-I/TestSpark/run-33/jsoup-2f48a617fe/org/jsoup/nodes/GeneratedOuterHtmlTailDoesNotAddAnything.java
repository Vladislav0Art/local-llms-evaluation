package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailDoesNotAddAnything {

    @Test
    public void outerHtmlTailDoesNotAddAnything() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings(false, false);
        Comment comment = new Comment("Some text");
        comment.outerHtmlTail(accum, 0, outputSettings);
        assertEquals("", accum.toString());
    }

}