package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetData_setData {

    @Test
    public void setData_setData() {
        String data = "CommentData";
        Comment comment = new Comment(data);
        comment.setData("NewData");
        assertEquals("NewData", comment.getData());
    }

}