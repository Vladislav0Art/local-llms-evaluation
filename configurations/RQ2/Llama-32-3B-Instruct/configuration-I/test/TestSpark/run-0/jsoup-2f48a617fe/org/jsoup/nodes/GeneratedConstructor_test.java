package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedConstructor_test {

    @Test
    public void constructor_test() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}