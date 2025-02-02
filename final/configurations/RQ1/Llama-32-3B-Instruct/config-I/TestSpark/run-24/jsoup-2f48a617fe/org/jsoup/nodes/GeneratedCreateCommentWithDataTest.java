package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateCommentWithDataTest {

    private static final String DATA = "This is a comment";

    @Test
    public void createCommentWithDataTest() {
        Comment comment = new Comment(DATA);
        assertEquals(DATA, comment.getData());
    }

}