package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("Some text");
        String actual = comment.getData();
        assertEquals("Some text", actual);
    }

}