package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneTest {

    @Mock
    private Comment comment;

    @Test
    public void cloneTest() {
        Comment cloneComment = comment.clone();
        assertEquals(comment, cloneComment);
    }

}