package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment commentClone = comment.clone();
        assertNotEquals(comment, commentClone);
        assertEquals(comment.getData(), commentClone.getData());
    }

}