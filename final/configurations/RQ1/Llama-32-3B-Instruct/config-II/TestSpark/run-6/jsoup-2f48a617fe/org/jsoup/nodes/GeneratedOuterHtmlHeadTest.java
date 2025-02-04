package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        String expectedOutput = "<!--data-->";
        assertTrue(accum.toString().equals(expectedOutput));
    }

}