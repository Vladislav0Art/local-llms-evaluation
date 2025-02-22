package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldGetData {

    private Comment comment;

    @Test
    public void shouldGetData() {
        comment = new Comment("Test");
        assertEquals("Test", comment.getData());
    }

}