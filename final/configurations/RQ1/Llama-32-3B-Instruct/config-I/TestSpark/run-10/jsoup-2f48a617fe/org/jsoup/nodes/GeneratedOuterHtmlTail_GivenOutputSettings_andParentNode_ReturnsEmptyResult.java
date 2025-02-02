package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTail_GivenOutputSettings_andParentNode_ReturnsEmptyResult {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void outerHtmlTail_GivenOutputSettings_andParentNode_ReturnsEmptyResult() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);

        Comment comment = new Comment("");
        String result = comment.outerHtmlTail(appendable, depth, outputSettings);
        assertEquals("", result);
    }

}