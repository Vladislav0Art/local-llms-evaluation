package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentConstruct][EmptyStringData]

Test {

    @Test
    public void [CommentConstruct][EmptyStringData]Test() {
        Comment comment = new Comment("");
        assertNotNull(comment);
        assertEquals("", comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}