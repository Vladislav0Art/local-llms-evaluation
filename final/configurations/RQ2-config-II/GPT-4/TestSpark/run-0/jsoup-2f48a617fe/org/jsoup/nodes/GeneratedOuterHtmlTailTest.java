package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        StringWriter stringWriter = new StringWriter();
        Comment comment = new Comment("Test data");
        Document.OutputSettings outputSettings = new Document.OutputSettings();

        comment.outerHtmlTail(stringWriter, 0, outputSettings);
        assertEquals("", stringWriter.toString());
    }

}