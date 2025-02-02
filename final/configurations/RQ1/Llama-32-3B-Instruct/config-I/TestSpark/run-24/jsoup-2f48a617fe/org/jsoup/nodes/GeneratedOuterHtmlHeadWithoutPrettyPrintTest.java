package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadWithoutPrettyPrintTest {

    private static final String DATA = "This is a comment";

    @Test
    public void outerHtmlHeadWithoutPrettyPrintTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = Document.OutputSettings.create().prettyPrint(false);
        Comment comment = new Comment(DATA);
        comment.outerHtmlHead(accum, 0, out);
        assertFalse(outContent.toString().contains("<!--"));
    }

}