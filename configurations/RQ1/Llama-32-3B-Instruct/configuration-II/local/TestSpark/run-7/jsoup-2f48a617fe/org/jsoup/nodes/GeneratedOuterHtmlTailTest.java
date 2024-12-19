package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Appendable out = new ByteArrayOutputStream();
        Document.OutputSettings outSettings = new Document.OutputSettings(false, true);

        Comment comment = new Comment("");
        comment.outerHtmlHead(out, 0, outSettings);
        String expectedOutput = "";
        assertEquals(expectedOutput, out.toString());
    }

}