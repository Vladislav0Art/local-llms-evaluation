package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}