package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewCommentNodeCreationTest {

    @Test
    public void newCommentNodeCreationTest() {
        Comment comment = new Comment("This is a test");
        assertNotNull(comment);
    }

}