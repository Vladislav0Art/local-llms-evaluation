package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTestOuterHtmlHeadAppendComment {

    @Test
    public void testOuterHtmlHeadAppendComment() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        comment.outerHtmlHead(accum, depth, out);

        // Assert
        verify(accum, times(1)).append("<!--test-->");
    }

}