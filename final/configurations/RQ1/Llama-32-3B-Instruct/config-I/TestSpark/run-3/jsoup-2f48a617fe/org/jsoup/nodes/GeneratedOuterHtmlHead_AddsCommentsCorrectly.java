package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHead_AddsCommentsCorrectly {

    @Test
    public void outerHtmlHead_AddsCommentsCorrectly() {
        // Given
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("data");
        when(comment.coreValue()).thenReturn(comment.value);

        // When
        comment.outerHtmlHead(accum, 0, out);

        // Then
        verify(accum).append(eq("<!--"));
        verify(accum).append(comment.value);
        verify(accum).append("-->");
    }

}