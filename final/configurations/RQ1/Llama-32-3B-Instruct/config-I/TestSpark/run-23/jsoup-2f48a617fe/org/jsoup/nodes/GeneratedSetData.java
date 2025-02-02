package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedSetData {

    @Test
    public void setData() {
        String data = "New comment";
        Comment comment = new Comment("This is a comment");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}