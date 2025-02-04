package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreate_new_comment_node_with_data {

    @Test
    public void create_new_comment_node_with_data() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a comment", comment.getData());
    }

}