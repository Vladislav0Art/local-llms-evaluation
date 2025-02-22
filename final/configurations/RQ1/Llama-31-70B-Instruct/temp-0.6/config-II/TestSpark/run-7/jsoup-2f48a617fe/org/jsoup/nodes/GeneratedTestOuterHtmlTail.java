package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlTail {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Comment content");
    }

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = mock(Appendable.class);
        int depth = 5;
        Document.OutputSettings out = mock(Document.OutputSettings.class);

        comment.outerHtmlTail(accum, depth, out);

        verifyZeroInteractions(accum);
    }

}