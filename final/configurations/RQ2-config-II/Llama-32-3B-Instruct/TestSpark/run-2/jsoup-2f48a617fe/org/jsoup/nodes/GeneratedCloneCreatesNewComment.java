package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneCreatesNewComment {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void cloneCreatesNewComment() {
        Comment original = new Comment("data");
        Comment cloned = original.clone();
        assertNotNull(cloned);
        assertNotSame(original, cloned);
    }

}