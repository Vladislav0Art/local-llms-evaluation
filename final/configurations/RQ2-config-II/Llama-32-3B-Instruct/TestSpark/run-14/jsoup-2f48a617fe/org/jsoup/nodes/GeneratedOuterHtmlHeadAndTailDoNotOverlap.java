package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlHeadAndTailDoNotOverlap {

    @Test
    public void outerHtmlHeadAndTailDoNotOverlap() {
        ByteArrayOutputStream out1 = new ByteArrayOutputStream();
        Appendable accum1 = out1;
        int depth1 = 0;
        Document.OutputSettings outSettings1 = new Document.OutputSettings();
        Comment comment1 = new Comment("");
        comment1.outerHtmlHead(accum1, depth1, outSettings1);

        ByteArrayOutputStream out2 = new ByteArrayOutputStream();
        Appendable accum2 = out2;
        int depth2 = 0;
        Document.OutputSettings outSettings2 = new Document.OutputSettings();
        Comment comment2 = new Comment("");
        comment2.outerHtmlTail(accum2, depth2, outSettings2);

        assertEquals("", out1.toString());
        assertEquals("", out2.toString());
    }

}