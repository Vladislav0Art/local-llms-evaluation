package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHead_GivenOutputSettings_andParentNode_ReturnsResultAsString {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void outerHtmlHead_GivenOutputSettings_andParentNode_ReturnsResultAsString() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);

        when(outputSettings.prettyPrint()).thenReturn(true);
        when(parentNode.tag().formatAsBlock()).thenReturn(true);

        Comment comment = new Comment("");
        String result = comment.outerHtmlHead(appendable, depth, outputSettings);
        assertNotNull(result);
    }

}