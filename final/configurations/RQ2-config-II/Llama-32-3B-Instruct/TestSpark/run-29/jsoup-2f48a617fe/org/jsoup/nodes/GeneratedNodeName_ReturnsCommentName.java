package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeName_ReturnsCommentName {

    @Mock
    private Appendable accum;

    @Test
    public void nodeName_ReturnsCommentName() {
        when(comment.nodeName()).thenReturn("comment");
        assertEquals("comment", comment.nodeName());
    }

}