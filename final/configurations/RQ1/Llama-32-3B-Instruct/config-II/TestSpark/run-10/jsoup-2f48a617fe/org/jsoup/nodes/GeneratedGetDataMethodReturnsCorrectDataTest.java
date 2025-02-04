package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetDataMethodReturnsCorrectDataTest {

    @Test
    public void getDataMethodReturnsCorrectDataTest() {
        Comment comment = new Comment("This is a test");
        String data = comment.getData();
        assertTrue(data.startsWith("<!--"));
        assertTrue(data.endsWith("-->"));
    }

}