package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTailNoCommentContentTest {

    @Test
    public void outerHtmlTailNoCommentContentTest() {
        Comment comment = new Comment("");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(appendable, depth, outputSettings);
    }

}