package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        String data = "data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}