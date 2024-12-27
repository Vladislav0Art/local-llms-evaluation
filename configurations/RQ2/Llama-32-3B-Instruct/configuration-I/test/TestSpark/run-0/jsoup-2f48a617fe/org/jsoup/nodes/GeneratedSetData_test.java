package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetData_test {

    @Test
    public void setData_test() {
        Comment comment = new Comment();
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}