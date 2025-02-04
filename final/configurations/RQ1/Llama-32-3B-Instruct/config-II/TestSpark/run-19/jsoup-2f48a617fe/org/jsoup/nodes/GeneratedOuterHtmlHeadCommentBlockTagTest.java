package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadCommentBlockTagTest {

    @Test
    public void outerHtmlHeadCommentBlockTagTest() {
        Comment comment = new Comment("This is a comment");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);
        comment.outerHtmlHead(appendable, depth, outputSettings);
        verify(outputSettings).prettyPrint();
    }

}