package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlHead(appendable, 0, outputSettings);
        Mockito.verify(appendable).append("<!--Test data-->");
    }

}