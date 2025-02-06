package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_ReturnsClonedComment {

    @Mock
    private Appendable accum;

    @Test
    public void clone_ReturnsClonedComment() {
        Comment clonedComment = new Comment("data");
        Comment expectedComment = new Comment("data");
        assertSame(expectedComment, comment.clone());
    }

}