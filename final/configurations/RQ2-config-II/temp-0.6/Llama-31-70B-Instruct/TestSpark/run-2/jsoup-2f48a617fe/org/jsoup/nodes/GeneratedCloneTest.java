package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Comment");
        Comment cloneComment = comment.clone();
        assertEquals("Comment", cloneComment.getData());
    }

}