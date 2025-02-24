package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Comment");
        assertEquals("Comment", comment.getData());
    }

}