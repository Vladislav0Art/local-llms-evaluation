package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedOuterHtmlHead_calledWithDefaultSettings {

    @Test
    public void outerHtmlHead_calledWithDefaultSettings() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

}