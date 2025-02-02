package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetGetDataTest {

    private static final String DATA = "This is a comment";

    @Test
    public void setGetDataTest() {
        Comment comment = new Comment(DATA);
        String newData = "New data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}