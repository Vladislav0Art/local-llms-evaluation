package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDataTest {

    @Test
    public void DataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}