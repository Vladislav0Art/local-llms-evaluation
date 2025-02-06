package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedCreateCommentWithData {

    @Test
    public void createCommentWithData() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

}