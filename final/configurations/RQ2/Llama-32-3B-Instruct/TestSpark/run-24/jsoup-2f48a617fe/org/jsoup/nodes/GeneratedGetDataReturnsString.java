package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedGetDataReturnsString {

    @Test
    public void getDataReturnsString() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}