package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Test Comment");
        Appendable accumulator = mock(Appendable.class);
        comment.outerHtmlHead(accumulator, 1, new Document.OutputSettings());
        verify(accumulator).append("<!--Test Comment-->");
    }

}