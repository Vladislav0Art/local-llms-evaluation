package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedOuterHtmlHead_makesOuterHtmlHead {

    @Test
    public void outerHtmlHead_makesOuterHtmlHead() throws IOException {
        // Arrange
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        int depth = 0;
        // Act & Assert
        when(out.toString()).thenReturn("");
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

}