package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCloneCommentTest {

    @Test
    public void cloneCommentTest() {
        String data = "comment text";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(data, clonedComment.getData());
    }

}