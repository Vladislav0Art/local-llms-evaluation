package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedSetDataAndGetDataTest {

    @Test
    public void setDataAndGetDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());

        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}