package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        Comment comment = new Comment("");
        String strComment = comment.toString();
        assertNotNull(strComment);
    }

}