package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedCloneComment {

    @Test
    public void cloneComment() throws Exception {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 1;
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone(document, accum, depth);
        assertNotNull(clonedComment);
    }

}