package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetDataSetTest {

    @Test
    public void getDataSetTest() {
        Comment comment = new Comment("Initial data");
        String newData = "New data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}