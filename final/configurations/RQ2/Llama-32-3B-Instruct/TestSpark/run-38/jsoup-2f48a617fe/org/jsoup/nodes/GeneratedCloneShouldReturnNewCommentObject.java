package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneShouldReturnNewCommentObject {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void cloneShouldReturnNewCommentObject() {
        Comment comment = new Comment(data);
        Comment clone = comment.clone();
        Mockito.verify(comment).clone();
        assertNotSame(comment, clone);
    }

}