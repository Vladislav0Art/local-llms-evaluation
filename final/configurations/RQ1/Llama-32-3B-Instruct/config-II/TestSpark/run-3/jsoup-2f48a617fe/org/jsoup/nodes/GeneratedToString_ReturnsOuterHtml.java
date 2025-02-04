package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToString_ReturnsOuterHtml {

    @Test
    public void toString_ReturnsOuterHtml() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("");
        comment.outerHtml(accum, 0, out);
        String output = accum.toString();
        assertTrue(output.contains("<!--"));
    }

}