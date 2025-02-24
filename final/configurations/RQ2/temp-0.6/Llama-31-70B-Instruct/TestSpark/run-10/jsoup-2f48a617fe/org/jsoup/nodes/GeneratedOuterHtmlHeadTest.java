package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("test");
        comment.outerHtmlHead(appendable, 1, outputSettings);
        Mockito.verify(appendable).append("<!--test-->");
    }

}