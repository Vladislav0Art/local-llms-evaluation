package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTestOuterHtmlTailAppendComment {

    @Test
    public void testOuterHtmlTailAppendComment() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        comment.outerHtmlTail(accum, depth, out);

        // Assert
        verify(accum, times(1)).append("-->");
    }

}