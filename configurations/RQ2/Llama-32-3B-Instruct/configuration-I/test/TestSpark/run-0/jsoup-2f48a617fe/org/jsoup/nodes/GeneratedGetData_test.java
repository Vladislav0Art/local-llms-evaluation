package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetData_test {

    @Test
    public void getData_test() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}