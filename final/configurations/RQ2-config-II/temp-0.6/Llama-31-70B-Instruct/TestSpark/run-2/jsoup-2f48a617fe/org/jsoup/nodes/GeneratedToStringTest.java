package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Some data");
        assertEquals("<!--Some data-->", comment.toString());
    }

}