package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        String expectedData = "new data";
        comment.setData(expectedData);
        String actualData = comment.getData();
        assertEquals(expectedData, actualData);
    }

}