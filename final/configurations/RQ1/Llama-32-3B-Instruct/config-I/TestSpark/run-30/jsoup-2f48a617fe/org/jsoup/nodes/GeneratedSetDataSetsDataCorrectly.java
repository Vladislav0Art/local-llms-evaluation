package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetDataSetsDataCorrectly {

    @Test
    public void setDataSetsDataCorrectly() throws IOException {
        String data = "Hello, world!";
        Comment comment = new Comment(data);
        comment.setData("Goodbye, world!");
        assertEquals("Goodbye, world!", comment.getData());
    }

}