package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructor_WithValidInput_SetsData {

    @Test
    public void constructor_WithValidInput_SetsData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

}