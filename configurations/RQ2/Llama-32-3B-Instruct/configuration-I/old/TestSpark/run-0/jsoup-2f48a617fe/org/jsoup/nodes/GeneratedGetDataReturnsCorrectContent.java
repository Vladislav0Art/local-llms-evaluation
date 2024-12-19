package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetDataReturnsCorrectContent {

    @Test
    public void getDataReturnsCorrectContent() {
        Comment comment = new Comment("This is a comment");
        String data = "This is a comment";
        Comment clonedComment = comment.clone();
        assertEquals(data, clonedComment.getData());
    }

}