package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCommentConstructorTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("test comment");
        assertNotNull(comment);
    }

}