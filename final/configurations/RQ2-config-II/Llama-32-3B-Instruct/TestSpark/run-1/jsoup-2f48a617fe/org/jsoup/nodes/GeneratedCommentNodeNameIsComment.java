package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedCommentNodeNameIsComment {

    @Test
    public void commentNodeNameIsComment() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}