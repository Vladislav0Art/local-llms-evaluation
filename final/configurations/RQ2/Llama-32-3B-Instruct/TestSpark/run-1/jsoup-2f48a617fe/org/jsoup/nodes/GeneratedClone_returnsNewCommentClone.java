package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedClone_returnsNewCommentClone {

    @Test
    public void clone_returnsNewCommentClone() {
        Comment comment1 = new Comment("data");
        Comment comment2 = comment1.clone();
        assertNotNull(comment2);
        assertEquals(comment1, comment2);
    }

}