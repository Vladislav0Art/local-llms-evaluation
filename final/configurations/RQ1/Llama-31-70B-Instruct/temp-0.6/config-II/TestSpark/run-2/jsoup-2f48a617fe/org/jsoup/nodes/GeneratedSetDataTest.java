package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "data";
        Comment comment = new Comment(data);
        String newData = "newData";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}