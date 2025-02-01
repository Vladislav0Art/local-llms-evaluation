package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}