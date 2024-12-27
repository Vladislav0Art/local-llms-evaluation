package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String data = "Test data";
        Comment comment = new Comment(data);
        Comment cloneComment = comment.clone();
        assertEquals(comment.getData(), cloneComment.getData());
        assertNotSame(comment, cloneComment);
    }

}