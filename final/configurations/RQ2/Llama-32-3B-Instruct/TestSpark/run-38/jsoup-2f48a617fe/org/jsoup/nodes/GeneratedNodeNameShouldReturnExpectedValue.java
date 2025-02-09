package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameShouldReturnExpectedValue {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void nodeNameShouldReturnExpectedValue() {
        Comment comment = new Comment(data);
        comment.nodeName();
        Mockito.verify(comment).nodeName();
    }

}