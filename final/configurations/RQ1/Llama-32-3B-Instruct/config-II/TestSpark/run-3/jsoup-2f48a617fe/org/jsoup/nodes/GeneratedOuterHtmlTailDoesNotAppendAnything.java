package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, 0, out);
        Comment comment2 = new Comment("");
        comment.outerHtmlTail(accum, 1, out);
        String output = accum.toString();
        assertTrue(!output.contains("<!--"));
    }

}