package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailTestsEmptyOutputCorrectly {

    @Test
    public void outerHtmlTailTestsEmptyOutputCorrectly() {
        Comment comment = new Comment("");
        Appendable output = new StringBuilder();
        Document.OutputSettings settings = Document.OutputSettings.preserveCase;
        comment.outerHtmlHead(output, 0, settings);
        assertTrue(output.toString().isEmpty());
    }

}