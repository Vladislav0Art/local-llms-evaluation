package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailNoOp {

    @Test
    public void outerHtmlTailNoOp() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- This is a comment -->");
        try {
            comment.outerHtmlHead(accum, 0, out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}