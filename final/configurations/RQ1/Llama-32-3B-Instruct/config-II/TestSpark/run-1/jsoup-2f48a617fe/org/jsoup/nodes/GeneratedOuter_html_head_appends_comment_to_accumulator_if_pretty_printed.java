package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuter_html_head_appends_comment_to_accumulator_if_pretty_printed {

    @Test
    public void outer_html_head_appends_comment_to_accumulator_if_pretty_printed() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("This is a comment");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<!--This is a comment-->\n";
        assertEquals(expectedOutput, outContent.toString());
    }

}