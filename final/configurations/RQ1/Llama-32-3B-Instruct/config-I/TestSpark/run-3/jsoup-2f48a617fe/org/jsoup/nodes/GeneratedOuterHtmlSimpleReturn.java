package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedOuterHtmlSimpleReturn {

    @Test
    public void outerHtmlSimpleReturn() {
        // Given
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");

        // When
        String result = comment.outerHtml();

        // Then
        assertNotNull(result);
    }

}