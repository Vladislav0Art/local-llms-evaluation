package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlTailCommentHtmlTailTest {

    @Test
    public void outerHtmlTailCommentHtmlTailTest() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 1;
        Comment comment = new Comment("test");
        comment.outerHtmlTail(document, accum, depth);
        assertTrue(accum.toString().contains("</comment>"));
    }

}