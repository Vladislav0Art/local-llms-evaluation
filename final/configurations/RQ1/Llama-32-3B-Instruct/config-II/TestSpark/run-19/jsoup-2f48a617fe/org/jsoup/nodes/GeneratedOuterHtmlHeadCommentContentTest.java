package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadCommentContentTest {

    @Test
    public void outerHtmlHeadCommentContentTest() {
        Comment comment = new Comment("This is a comment");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(appendable, depth, outputSettings);
        verify(appendable).append(eq("//<!--"));
        verify(appendable).append(eq("This is a comment"));
        verify(appendable).append(eq("-->"));
    }

}