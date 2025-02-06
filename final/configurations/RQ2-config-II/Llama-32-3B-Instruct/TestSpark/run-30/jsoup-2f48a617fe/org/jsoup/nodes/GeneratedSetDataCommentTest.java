package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataCommentTest {

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}