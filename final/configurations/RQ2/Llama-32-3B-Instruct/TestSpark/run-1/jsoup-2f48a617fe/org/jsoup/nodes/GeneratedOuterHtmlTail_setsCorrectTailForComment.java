package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTail_setsCorrectTailForComment {

    @Test
    public void outerHtmlTail_setsCorrectTailForComment() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        String expectedOutput = "<!-- comment -->\n";
        assertTrue(comment.outerHtmlTail(bos, 0, out).equals(expectedOutput));
    }

}