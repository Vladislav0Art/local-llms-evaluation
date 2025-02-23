package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Old data");
        assertEquals("Old data", comment.getData());

        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}