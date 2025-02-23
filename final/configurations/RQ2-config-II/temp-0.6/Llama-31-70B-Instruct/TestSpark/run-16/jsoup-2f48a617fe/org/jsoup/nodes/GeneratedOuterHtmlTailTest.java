package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("hello");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("", builder.toString());
    }

}