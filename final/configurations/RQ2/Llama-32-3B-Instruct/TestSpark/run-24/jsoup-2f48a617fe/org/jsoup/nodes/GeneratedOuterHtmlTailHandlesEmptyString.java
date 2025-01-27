package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlTailHandlesEmptyString {

    @Test
    public void outerHtmlTailHandlesEmptyString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        Appendable text = new StringBuilder(output.toString());
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlTail(text, depth, out);
        assertFalse(output.toString().isEmpty());
    }

}