package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentDataConstructorTest {

    @Test
    public void CommentDataConstructorTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

}