package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadMethodTest {

    @Test
    public void outerHtmlHeadMethodTest() throws IOException {
        // Arrange
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);

        // Act
        new Comment("some data").outerHtmlHead(accum, depth, out);

        // Assert
        verify(accum).append("<!-- some data -->");
    }

}