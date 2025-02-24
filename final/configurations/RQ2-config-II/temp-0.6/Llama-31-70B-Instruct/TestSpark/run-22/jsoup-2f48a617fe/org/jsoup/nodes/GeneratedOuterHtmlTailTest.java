package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable mockAppendable = Mockito.mock(Appendable.class);
        comment.outerHtmlTail(mockAppendable, 1, null);
        verifyNoMoreInteractions(mockAppendable);
    }

}