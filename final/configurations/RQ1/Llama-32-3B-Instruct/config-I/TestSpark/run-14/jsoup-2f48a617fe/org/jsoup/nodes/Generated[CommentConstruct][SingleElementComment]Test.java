package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentConstruct][SingleElementComment]

Test {

    @Test
    public void [CommentConstruct][SingleElementComment]Test() {
        Comment comment = new Comment("Hello");
        assertNotNull(comment);
        assertEquals("Hello", comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}