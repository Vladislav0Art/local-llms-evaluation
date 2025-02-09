package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentShouldBeInitializedWithGivenData {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void newCommentShouldBeInitializedWithGivenData() {
        new Comment(data);
        Mockito.verify(data).equals(Mockito.anyString());
    }

}