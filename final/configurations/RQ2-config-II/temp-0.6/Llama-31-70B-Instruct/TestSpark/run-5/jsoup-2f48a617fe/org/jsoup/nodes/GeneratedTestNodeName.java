package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        Comment comment = mock(Comment.class);
        Mockito.when(comment.nodeName()).thenReturn("#comment");
        assertEquals("#comment", comment.nodeName());
    }

}