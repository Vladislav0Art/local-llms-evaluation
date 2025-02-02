package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlTailIsNotSet {

    @Test
    public void outerHtmlTailIsNotSet() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        Comment comment = new Comment("");
        comment.outerHtmlTail(outContent, 0, outputSettings);
        assertEquals("", outContent.toString());
    }

}