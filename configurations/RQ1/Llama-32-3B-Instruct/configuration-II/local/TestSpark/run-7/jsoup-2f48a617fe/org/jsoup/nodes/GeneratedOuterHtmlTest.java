package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() throws IOException {
        Appendable out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings(true, true);

        Comment comment = new Comment("test data");
        comment.outerHtml(out, 0, outSettings);
        String expectedOutput = "<!--test data-->";
        assertEquals(expectedOutput, out.toString());
    }

}