package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadAppendsCorrectStringToAccum {

    @Test
    public void outerHtmlHeadAppendsCorrectStringToAccum() throws IOException {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // When
        Comment comment = new Comment("test");
        comment.outerHtmlHead(accum, depth, out);

        // Then
        assertEquals("<!-- test -->", accum.toString());
    }

}