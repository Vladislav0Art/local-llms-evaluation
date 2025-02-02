package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedCloneCommentReturnsNewComment {

    @Test
    public void cloneCommentReturnsNewComment() {
        Comment comment = new Comment("some data");
        Comment cloned = comment.clone();
        assertNotSame(comment, cloned);
    }
}

}