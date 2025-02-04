package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTestsHtmlOutputCorrectly {

    @Test
    public void outerHtmlHeadTestsHtmlOutputCorrectly() throws IOException {
        Comment comment = new Comment("<xml version=\"1.0\"?xml declaration=\"...\">This is a test</xml>");
        Appendable output = new StringBuilder();
        Document.OutputSettings settings = Document.OutputSettings.preserveCase;
        comment.outerHtmlHead(output, 0, settings);
        assertTrue(output.toString().contains("<!--This is a test-->"));
    }

}