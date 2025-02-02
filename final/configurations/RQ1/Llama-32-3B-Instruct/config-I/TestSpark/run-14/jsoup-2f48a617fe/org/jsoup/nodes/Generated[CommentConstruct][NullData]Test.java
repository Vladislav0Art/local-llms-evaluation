package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentConstruct][NullData]

Test {

    @Test
    public void [CommentConstruct][NullData]Test() throws IOException {
        Comment comment = new Comment(null);
        assertNotNull(comment);
        assertNull(comment.getData());
        assertEquals("#comment", comment.nodeName());
    }

}