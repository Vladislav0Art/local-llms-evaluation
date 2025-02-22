package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("Some text");
        comment.setData("New text");
        assertEquals("New text", comment.getData());
    }

}