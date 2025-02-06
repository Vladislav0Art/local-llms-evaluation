package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewCommentHasCorrectData {

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment("Some data");
        assertEquals("Some data", comment.getData());
    }

}