package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_comment_clone {

    @Test
    public void clone_comment_clone() {
        String data = "CommentData";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(data, cloned.getData());
    }

}