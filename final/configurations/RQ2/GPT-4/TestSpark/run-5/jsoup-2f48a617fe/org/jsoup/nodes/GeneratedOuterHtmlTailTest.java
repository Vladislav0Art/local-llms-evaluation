package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("Test data");
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        comment.outerHtmlTail(appendable, 0, outputSettings);
        assertNotNull(appendable);
    }

}