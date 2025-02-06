package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedOuterHtmlTailWithoutDepthIsEmpty {

    @Test
    public void outerHtmlTailWithoutDepthIsEmpty() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, 0, Document.OutputSettings.DEFAULT);
        assertTrue(outContent.toString().isEmpty());
    }

}