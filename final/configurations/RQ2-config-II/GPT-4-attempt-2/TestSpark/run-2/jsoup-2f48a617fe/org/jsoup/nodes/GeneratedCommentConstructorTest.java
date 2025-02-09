package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentConstructorTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("Data");
        assertNotNull(comment);
        assertEquals("Data", comment.getData());
    }

}