package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedOuterHtmlTailIsNeverCalled {

    @Test
    public void outerHtmlTailIsNeverCalled() {
        // Given
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");

        // When
        comment.outerHtmlTail(accum, 0, out);

        // Then
        verifyNoMoreInteractions(accum, out);
    }

}