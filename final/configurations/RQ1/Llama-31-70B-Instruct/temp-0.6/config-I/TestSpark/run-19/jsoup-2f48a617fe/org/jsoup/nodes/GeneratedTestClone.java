package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertEquals("test", clone.getData());
    }

}