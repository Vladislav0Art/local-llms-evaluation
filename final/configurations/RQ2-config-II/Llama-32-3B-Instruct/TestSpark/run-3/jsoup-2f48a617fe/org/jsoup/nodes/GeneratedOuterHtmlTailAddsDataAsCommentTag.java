package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailAddsDataAsCommentTag {

    @Test
    public void outerHtmlTailAddsDataAsCommentTag() throws IOException {
        Comment comment = new Comment("data");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Appendable accum = out;
        int depth = 0;
        comment.outerHtmlTail(accum, depth, outSettings);
        String output = out.toString();
        assertTrue(output.contains("<!--"));
        assertTrue(output.contains("-->"));
    }

}