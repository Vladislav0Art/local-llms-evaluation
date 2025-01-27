package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailAppendsCorrectStringToAccum {

    @Test
    public void outerHtmlTailAppendsCorrectStringToAccum() {
        // Given
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // When
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, depth, out);

        // Then
        assertEquals("", accum.toString());
    }

}