package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_RestoreComment {

    @Test
    public void OuterHtmlHead_RestoreComment() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        int depth = 1;
        String expectedOutput = "<!--Hello, World!-->";
        Comment comment = new Comment("<!-- Hello, World! -->");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains(expectedOutput));
    }

}