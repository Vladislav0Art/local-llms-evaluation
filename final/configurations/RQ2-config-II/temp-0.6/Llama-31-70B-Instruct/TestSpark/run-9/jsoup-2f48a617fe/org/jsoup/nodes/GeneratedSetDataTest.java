package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Initial data");
        assertEquals("Initial data", comment.getData());

        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}