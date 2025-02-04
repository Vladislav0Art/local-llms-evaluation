package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuter_html_tail_does_not_append_to_accumulator {

    @Test
    public void outer_html_tail_does_not_append_to_accumulator() {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlTail(accum, 0, out);
        String expectedOutput = "";
        assertEquals(expectedOutput, accum.toString());
    }

}