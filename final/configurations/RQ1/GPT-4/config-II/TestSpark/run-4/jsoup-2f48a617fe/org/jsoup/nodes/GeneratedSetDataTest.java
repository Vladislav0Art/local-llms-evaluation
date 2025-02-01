package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        Comment updatedComment = comment.setData("updatedTest");
        assertEquals("updatedTest", updatedComment.getData());
    }

}