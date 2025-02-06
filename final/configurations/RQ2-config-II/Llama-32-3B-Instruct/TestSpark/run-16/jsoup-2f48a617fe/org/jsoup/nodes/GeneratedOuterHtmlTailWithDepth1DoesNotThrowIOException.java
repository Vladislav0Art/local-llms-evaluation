package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailWithDepth1DoesNotThrowIOException {

    @Test
    public void outerHtmlTailWithDepth1DoesNotThrowIOException() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        int depth = 1;

        // Act and Assert
        comment.outerHtmlTail(accum, depth, out);
    }

}