package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldSetData {

    private Comment comment;

    @Test
    public void shouldSetData() {
        comment = new Comment("Test");
        comment.setData("New test");
        assertEquals("New test", comment.getData());
    }

}