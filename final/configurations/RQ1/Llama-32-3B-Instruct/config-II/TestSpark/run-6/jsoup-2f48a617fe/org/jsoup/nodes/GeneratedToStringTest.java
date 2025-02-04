package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() throws IOException {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        String expectedOutput = "<!--data-->";
        comment.outerHtml(accum, 0, out);
        assertTrue(accum.toString().equals(expectedOutput));
    }

}