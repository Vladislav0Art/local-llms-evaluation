package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetDataEmptyStringReturnsEmptyString {

    @Test
    public void getDataEmptyStringReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}