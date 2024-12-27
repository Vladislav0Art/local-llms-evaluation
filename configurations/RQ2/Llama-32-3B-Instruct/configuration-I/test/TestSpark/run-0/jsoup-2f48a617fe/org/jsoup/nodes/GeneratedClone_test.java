package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}