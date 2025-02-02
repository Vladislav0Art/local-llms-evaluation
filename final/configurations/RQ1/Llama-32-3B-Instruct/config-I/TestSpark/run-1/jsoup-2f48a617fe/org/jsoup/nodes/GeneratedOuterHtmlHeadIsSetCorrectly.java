package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlHeadIsSetCorrectly {

    @Test
    public void outerHtmlHeadIsSetCorrectly() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        when(outputSettings.prettyPrint()).thenReturn(true);
        Comment comment = new Comment("<!-- Data -->");
        comment.outerHtmlHead(outContent, 0, outputSettings);
        assertEquals("<!--Data-->", outContent.toString());
    }

}