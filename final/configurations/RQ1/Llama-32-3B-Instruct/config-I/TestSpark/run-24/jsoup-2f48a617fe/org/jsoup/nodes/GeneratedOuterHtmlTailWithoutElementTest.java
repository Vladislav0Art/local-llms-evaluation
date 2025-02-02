package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailWithoutElementTest {

    private static final String DATA = "This is a comment";

    @Test
    public void outerHtmlTailWithoutElementTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.create();
        Comment comment = new Comment(DATA);
        comment.outerHtmlHead(accum, 0, out);
        assertTrue(outContent.toString().contains("<!--"));
    }

}