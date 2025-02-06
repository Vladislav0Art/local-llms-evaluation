package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadIncludesDataInOutput {

    @Test
    public void outerHtmlHeadIncludesDataInOutput() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.createEmptyDocument();
        Comment comment = new Comment("Some data");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- Some data -->", outContent.toString());
    }

}