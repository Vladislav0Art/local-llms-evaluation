package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHead_throwsIOExceptionWhenAccumulatorIsFull {

    @Test
    public void outerHtmlHead_throwsIOExceptionWhenAccumulatorIsFull() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Appendable accum = bos;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, 0, out));
    }

}