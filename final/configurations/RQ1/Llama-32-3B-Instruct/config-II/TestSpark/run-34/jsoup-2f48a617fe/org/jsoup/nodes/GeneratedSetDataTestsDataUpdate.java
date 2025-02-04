package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSetDataTestsDataUpdate {

    @Test
    public void setDataTestsDataUpdate() throws IOException {
        Comment comment = new Comment("This is a test");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}