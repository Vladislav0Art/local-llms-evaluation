package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doNothing().when(comment).outerHtmlHead(Mockito.any(), Mockito.anyInt(), Mockito.any());
        comment.outerHtmlHead(Mockito.any(), Mockito.anyInt(), Mockito.any());
    }

}