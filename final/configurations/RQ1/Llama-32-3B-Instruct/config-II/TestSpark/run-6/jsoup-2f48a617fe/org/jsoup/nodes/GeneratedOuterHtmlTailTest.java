package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new ByteArrayOutputStream();
        Document.OutputSettings out = new Document.OutputSettings(false, false);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, 0, out);
        assertTrue(!accum.toString().contains(""));
    }

}