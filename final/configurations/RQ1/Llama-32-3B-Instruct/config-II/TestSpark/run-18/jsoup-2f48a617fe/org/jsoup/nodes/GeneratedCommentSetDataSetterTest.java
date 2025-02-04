package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedCommentSetDataSetterTest {

    @Test
    public void CommentSetDataSetterTest() {
        String data = "test";
        Comment comment = new Comment(data);
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}