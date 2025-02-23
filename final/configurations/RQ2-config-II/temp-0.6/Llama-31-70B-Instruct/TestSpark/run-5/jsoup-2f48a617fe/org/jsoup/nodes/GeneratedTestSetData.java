package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("test2");
        assertEquals("test2", comment.getData());
    }

}