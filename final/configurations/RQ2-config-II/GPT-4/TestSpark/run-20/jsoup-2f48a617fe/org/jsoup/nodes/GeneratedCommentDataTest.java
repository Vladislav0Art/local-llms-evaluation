package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedCommentDataTest {

    @Test
    public void CommentDataTest() {
        Comment comment = new Comment("test data");
        assertNotNull(comment);
        assertEquals("test data", comment.getData());
    }

}