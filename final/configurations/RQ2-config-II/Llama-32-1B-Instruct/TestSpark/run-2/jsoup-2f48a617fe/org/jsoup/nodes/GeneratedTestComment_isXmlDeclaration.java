package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.BeforeEach;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GeneratedTestComment_isXmlDeclaration {

    public static final CommentCommentData DATA = new CommentCommentData("test");

    private Comment comment;

    @BeforeEach
    void setup() {
        comment = new Comment(DATA.getData());
    }

    @Test
    public void testComment_isXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
    }

}