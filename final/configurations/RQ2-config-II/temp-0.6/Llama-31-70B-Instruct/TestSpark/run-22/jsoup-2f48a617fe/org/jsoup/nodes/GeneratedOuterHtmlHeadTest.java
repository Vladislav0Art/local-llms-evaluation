package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable mockAppendable = Mockito.mock(Appendable.class);
        comment.outerHtmlHead(mockAppendable, 1, null);
        verify(mockAppendable, times(1)).append("<!---->");
    }

}