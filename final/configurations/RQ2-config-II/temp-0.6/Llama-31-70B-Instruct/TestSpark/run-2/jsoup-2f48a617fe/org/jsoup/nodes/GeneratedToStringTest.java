package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Comment");
        assertEquals("Comment", comment.toString());
    }

}