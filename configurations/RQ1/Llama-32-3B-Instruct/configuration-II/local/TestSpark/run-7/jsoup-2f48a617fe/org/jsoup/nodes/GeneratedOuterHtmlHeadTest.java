package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable out = outContent;
        Document.OutputSettings outSettings = new Document.OutputSettings(true, true);

        Comment comment = new Comment("test data");
        comment.outerHtmlHead(out, 0, outSettings);
        String expectedOutput = "<!--test data-->";
        assertEquals(expectedOutput, outContent.toString());
    }

}