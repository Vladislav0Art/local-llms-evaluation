package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailIsNeverCalled {

    @Test
    public void outerHtmlTailIsNeverCalled() {
        Appendable appendable = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(appendable, depth, outputSettings);
        assertTrue(appendable.toString().isEmpty());
    }

}