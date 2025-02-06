package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedOuterHtmlTail_makesOuterHtmlTail {

    @Test
    public void outerHtmlTail_makesOuterHtmlTail() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        // Act & Assert
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(anyString());
    }

}