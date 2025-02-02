package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedDataGet {

    @Test
    public void dataGet() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment.getData());
    }

}