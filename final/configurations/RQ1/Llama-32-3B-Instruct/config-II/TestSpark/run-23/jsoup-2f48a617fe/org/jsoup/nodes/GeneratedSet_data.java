package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSet_data {

    @Test
    public void set_data() {
        Comment comment = new Comment("This is a test");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}