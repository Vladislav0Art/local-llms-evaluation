package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataOnComment {

    @Test
    public void setDataOnComment() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}