package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataMethodUpdatesDataCorrectlyTest {

    @Test
    public void setDataMethodUpdatesDataCorrectlyTest() {
        Comment comment = new Comment("This is a test");
        comment.setData("Updated data");
        String data = comment.getData();
        assertEquals("Updated data", data);
    }

}