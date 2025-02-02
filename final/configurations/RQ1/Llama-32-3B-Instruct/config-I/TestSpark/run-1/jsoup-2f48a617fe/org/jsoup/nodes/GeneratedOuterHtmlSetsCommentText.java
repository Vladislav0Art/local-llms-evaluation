package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlSetsCommentText {

    @Test
    public void outerHtmlSetsCommentText() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        Comment comment = new Comment("<!-- Data -->");
        comment.outerHtml(outContent, 0, outputSettings);
        assertEquals("<!--Data-->", outContent.toString());
    }

}