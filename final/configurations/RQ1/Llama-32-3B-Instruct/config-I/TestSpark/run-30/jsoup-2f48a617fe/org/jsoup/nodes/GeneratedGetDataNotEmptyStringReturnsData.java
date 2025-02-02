package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetDataNotEmptyStringReturnsData {

    @Test
    public void getDataNotEmptyStringReturnsData() {
        String data = "Hello, world!";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}