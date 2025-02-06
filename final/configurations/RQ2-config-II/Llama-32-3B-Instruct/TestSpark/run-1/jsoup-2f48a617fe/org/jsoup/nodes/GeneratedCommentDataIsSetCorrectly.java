package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedCommentDataIsSetCorrectly {

    @Test
    public void commentDataIsSetCorrectly() {
        Comment comment = new Comment("data");
        Comment setComment = new Comment("new data");
        setComment.setData(comment.getData());
        assertEquals("new data", setComment.getData());
    }

}