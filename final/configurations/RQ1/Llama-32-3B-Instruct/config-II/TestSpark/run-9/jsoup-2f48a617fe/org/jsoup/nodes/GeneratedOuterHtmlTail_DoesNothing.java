package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_DoesNothing {

    @Test
    public void OuterHtmlTail_DoesNothing() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        int depth = 1;
        Comment comment = new Comment("<!-- Hello, World! -->");
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(!accum.toString().contains("<!--"));
    }

}