package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedOuterHtmlHeadWithDepthOne {

    @Test
    public void outerHtmlHeadWithDepthOne() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 1, Document.OutputSettings.DEFAULT);
        assertTrue(outContent.toString().contains("<!-- data -->"));
    }

}