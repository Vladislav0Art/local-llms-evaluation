package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedToStringTest {

    @Test
    public void ToStringTest() {
        Comment comment = new Comment("data");
        assertEquals("Comment[data]", comment.toString());
    }

}