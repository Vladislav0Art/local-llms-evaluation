package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetDataChangesDataCorrectlyTest {

    @Test
    public void setDataChangesDataCorrectlyTest() {
        String data = "Old data";
        Comment comment = new Comment(data);
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}